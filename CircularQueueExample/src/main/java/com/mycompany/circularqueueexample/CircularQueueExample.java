/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circularqueueexample;

/**
 *
 * @author Harol
 */
public class CircularQueueExample {

    public static class CircularQueue {
        private int[] elements;
        private int front, rear, size;

        public CircularQueue(int capacity) {
            elements = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        public void enqueue(int element) {
            if (size < elements.length) {
                rear = (rear + 1) % elements.length;
                elements[rear] = element;
                size++;
            } else {
                System.out.println("La cola circular está llena. No se puede encolar.");
            }
        }

        public int dequeue() {
            if (size > 0) {
                int removedElement = elements[front];
                front = (front + 1) % elements.length;
                size--;
                return removedElement;
            } else {
                System.out.println("La cola circular está vacía. No se puede desencolar.");
                return -1;
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == elements.length;
        }

        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Elementos encolados: " + queue.size());

        int removedElement = queue.dequeue();
        System.out.println("Elemento desencolado: " + removedElement);

        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println("Elementos encolados después de desencolar y encolar: " + queue.size());
    }
}
