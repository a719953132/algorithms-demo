package com.alex.common;

/**
 * @Classname Node
 * @Description
 * @Date 2022/4/14 22:56
 * @Author Alex
 */
public class Node {

    private Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
