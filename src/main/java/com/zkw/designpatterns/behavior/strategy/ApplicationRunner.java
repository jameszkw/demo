package com.zkw.designpatterns.behavior.observer.strategy;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-23 上午 9:18
 **/

public class ApplicationRunner {
    private Application itsApplication=null;

    public ApplicationRunner(Application itsApplication) {
        this.itsApplication = itsApplication;
    }

    public void run(){
        itsApplication.init();
        while (!itsApplication.done()){
            itsApplication.idle();
        }
        itsApplication.cleanup();
    }
}
