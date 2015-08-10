package com.zkw.leveldb.connect;

import static org.fusesource.leveldbjni.JniDBFactory.asString;
import static org.fusesource.leveldbjni.JniDBFactory.factory;

import java.io.File;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.iq80.leveldb.DB;
import org.iq80.leveldb.DBIterator;
import org.iq80.leveldb.Options;

public class ConnLevelDb {
	private final String computeQueue = "levldb-task-compute";
	private final String monitorQueue = "levldb-monitor-queue";
	private DB computeQueueDb = null;
	private DB monitorQueueDb = null;
	private void conn() {
		System.out.println("Create Leveldb Queue ......");
		try {
			factory.destroy(new File(computeQueue), new Options());
			Thread.sleep(3 * 1000);

			Options options = new Options().createIfMissing(true);
			// options.cacheSize(64 * 1048576);
			// options.writeBufferSize(64 * 1048576);
			// options.blockSize(32 * 1024);
			computeQueueDb = factory.open(new File(computeQueue), options);

			factory.destroy(new File(monitorQueue), new Options());
			Thread.sleep(3 * 1000);

			options = new Options().createIfMissing(true);
			// options.cacheSize(64 * 1048576);
			// options.writeBufferSize(64 * 1048576);
			// options.blockSize(32 * 1024);
			monitorQueueDb = factory.open(new File(monitorQueue), options);


		} catch (Exception ex) {
			System.out.println(ExceptionUtils.getStackTrace(ex));
		}
	}
	
	private void getContent(){
		try {
			DBIterator iterator = computeQueueDb.iterator();
			for (iterator.seekToFirst(); iterator.hasNext(); iterator.next()) {
				String taskId = asString(iterator.peekNext().getKey());
				String scheduleJson = asString(iterator.peekNext().getValue());
				System.out.println(taskId+":"+scheduleJson);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ConnLevelDb db = new ConnLevelDb();
		db.conn();
		db.getContent();
	}
}
