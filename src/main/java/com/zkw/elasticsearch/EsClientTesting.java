package com.zkw.elasticsearch;

import java.util.Collection;
import java.util.Collection;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.bucket.terms.Terms.Bucket;
import org.elasticsearch.search.aggregations.metrics.avg.InternalAvg;

import static org.elasticsearch.index.query.FilterBuilders.andFilter;
import static org.elasticsearch.index.query.FilterBuilders.termFilter;
import static org.elasticsearch.index.query.QueryBuilders.filteredQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.search.aggregations.AggregationBuilders.terms;
import static org.elasticsearch.common.xcontent.XContentFactory.*;
public class EsClientTesting {
	
	private void insert(){
		
	}
	
    public static void main(String[] args) {

        Settings settings = ImmutableSettings.settingsBuilder().put("cluster.name", "James").build();
        TransportClient client = new TransportClient(settings);
        try {
            client.addTransportAddress(new InetSocketTransportAddress("10.0.1.53", 9300));

            SearchRequestBuilder requestBuilder = client.prepareSearch("twitter").setTypes("tweetn");
//            requestBuilder.setSize(1);
//            requestBuilder.setQuery(matchAllQuery());
//
//            String querySource = requestBuilder.toString();
//            querySource = querySource.replaceAll("\\s{2,}", "");
//            querySource = querySource.replaceAll("\r\n", "");
//
//            System.out.println("'" + querySource + "'");
//
//            SearchResponse searchResponse = requestBuilder.execute().actionGet();
//
//            System.out.println(searchResponse);
//            String source = "{\"size\":0,\"query\":{\"filtered\":{\"query\":{\"match_all\":{}},\"filter\":{\"and\":{\"filters\":[{\"term\":{\"target_type\":\"1\"}},{\"term\":{\"target_id\":\"165\"}},{\"term\":{\"service_type\":\"2\"}},{\"range\":{\"collTime\":{\"from\":1405700000,\"to\":null,\"include_lower\":true,\"include_upper\":true}}}]}}}},\"aggregations\":{\"monitor_stat\":{\"terms\":{\"field\":\"monitorId\"},\"aggregations\":{\"ravility_stat\":{\"avg\":{\"field\":\"resp_status\"}}}}}}";
            String source = "{\"query\": {\"filtered\": {\"filter\": {\"range\": {\"age\": {\"gt\": 30}}},\"query\": {\"term\": {\"user\": \"james\"}}}}}";
            requestBuilder.setSource(source);
            
            SearchResponse searchResponse = requestBuilder.execute().actionGet();
            
            System.out.println(searchResponse);
            
           /* Terms monitorTerms = searchResponse.getAggregations().get("monitor_stat");
                    Collection<Bucket> monitorBucketColl = monitorTerms.getBuckets();

                    for (Bucket monitorBucket : monitorBucketColl) {
                        System.out.println(monitorBucket.getKey());
                        System.out.println(((InternalAvg)monitorBucket.getAggregations().get("ravility_stat")).getValue());
//                        Terms ravilityTerms = monitorBucket.getAggregations().get("ravility_stat");
//                        Collection<Bucket> ravilityBucketColl = ravilityTerms.getBuckets();
//                        for(Bucket ravilityBucket:ravilityBucketColl){
//                            System.out.println(ravilityBucket.getKey());
//                        }
                    }*/

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (client != null) {
                client.close();
            }
        }
    }
}
