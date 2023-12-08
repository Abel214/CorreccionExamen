/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Listas.Colas;

import Controlador.Listas.DynamicList;


/**
 *
 * @author ALEJANDRO
 */
  class Queue<E> extends DynamicList<E>{
    private Integer cima;

    public Queue(Integer tope) {
        this.cima = tope;
    }
    
    public Boolean isFull(){
        
        return getLength().intValue()>=cima.intValue();
    }
    public void queue(E info) throws Exception{
        if(isFull()){
           throw new FullStackException("Queque Full");
        } else{
            add(info);
        }
    }
     public E dequeue() throws Exception{
        E info=extractFirst();
        return info;
    }
     
    
}
