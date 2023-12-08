/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Listas.Colas;

import Controlador.Listas.Colas.FullStackException;



/**
 *
 * @author ALEJANDRO
 */
public class QueueUltimate<E> {
    private Queue<E>tail;
    public QueueUltimate(Integer length){
        this.tail=new Queue<>(length);
    }
    public void queue(E info)throws Exception, FullStackException{
        tail.queue(info);
    }
    public E dequeue()throws Exception{
    return tail.dequeue();
    }
    public Integer length(){
        return tail.getLength();
    }
    public Boolean isFull(){
        return tail.isFull();
    }
    public void print(){
        System.out.println("Queue");
        System.out.println(tail.toString());
        System.out.println("");
    }
}
