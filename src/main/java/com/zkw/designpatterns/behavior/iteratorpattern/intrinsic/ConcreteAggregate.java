package com.zkw.designpatterns.behavior.iteratorpattern.intrinsic;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-28 上午 10:06
 **/

public class ConcreteAggregate extends Aggregate {
    private Object[] objArray = null;

    /**
     * 构造方法，传入聚合对象的具体内容
     */
    public ConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }


    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }

    /**
     * 内部成员类，具体迭代子类
     */
    private class ConcreteIterator implements Iterator {
        //内部索引，记录当前迭代到的索引位置
        private int index = 0;
        //记录当前聚集对象的大小
        private int size = 0;

        /**
         * 构造函数
         */
        public ConcreteIterator() {
            this.size = objArray.length;
            index = 0;
        }

        /**
         * 迭代方法：移动到第一个元素
         */
        public void first() {
            index = 0;
        }

        /**
         * 迭代方法：移动到下一个元素
         */
        public void next() {
            if (index < size) {
                index++;
            }
        }

        /**
         * 迭代方法：是否为最后一个元素
         */
        public boolean isDone() {
            return (index >= size);
        }

        /**
         * 迭代方法：返还当前元素
         */
        public Object currentItem() {
            return objArray[index];
        }
    }
}
