package Controlador.Listas;

import Controlador.Listas.Excepciones.EstaVacia;






/*
Autor Abel Mora
*/
public class DynamicList <E>{
    private Node<E> header;
    private Node<E> last;
     Integer length;
    public DynamicList(){
        header = null;
        last = null;
        length = 0;
    }

    public Node<E> getHeader() {
        return header;
    }

    public void setHeader(Node<E> header) {
        this.header = header;
    }
    

    public void setLast(Node<E> last) {
        this.last = last;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Boolean isEmpty(){
        return header == null||length.intValue()==0;
    }
    private void addHeader(E info) {
         Node<E> help;
            if(isEmpty()){
                help=new Node<>(info);
                header=help;
                last=help;
                length++;
            } else{
                Node<E> headHelp=header;
                help=new Node<>(info,headHelp);
                header=help;
                length++;
            }
        }
    private void addLast(E info) {
        Node<E> help;
        if (isEmpty()) {
            addHeader(info);
        } else {
            Node<E> lastHelp=last;
            help = new Node<>(info,null);
            lastHelp.setNext(help);
            last = help;
            length++;
        }
    }
    public void add(E info){
        addLast(info);
    }
    private E getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Error,Lista Vacia");

        } else{
            return header.getInfo();
        }
    }

    private E getLast()throws Exception{
        if(isEmpty()){
            throw new Exception("Error,Lista Vacia");
        }

        return last.getInfo();

    }
    public E getInfo(Integer index) throws Exception{

        return getNode(index).getInfo();
    }
    public Node<E> getNode(Integer index) throws Exception{
        if(isEmpty()){
            throw new Exception("Fuera de lista") ;
        } else if(index.intValue()<0 || index.intValue()>=length){
            throw new IndexOutOfBoundsException("Error,fuera de rango");
        } else if(index.intValue()==0){
            return header;
        }else if(index.intValue()==(length-1)){
            return last;
        } else {
            Node<E> search = header;
            int cont = 0;
            while (cont < index) {
                cont++;
                search = search.getNext();
            }
            return search;
        }
    }
    
    public void add(E info,Integer index) throws Exception{
        if(isEmpty() || index.intValue()==0){
            addHeader(info);
        } else if(index.intValue()==length){
            addLast(info);
        } else {

            Node<E> search_preview=getNode(index);
            Node<E> search=getNode(index);
            Node <E> help=new Node <>(info,search);
            search_preview.setNext(help);
            length++;

        }
    }
    public E extractFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("List empty");
        }else{
            E element= header.getInfo();
            Node<E> help=header.getNext();
            header=null;
            header=help;
            if(length==1)
                last=null;
                length++;
                return element;
            
        }
       
    }
    public E extractLast() throws Exception{
        if(isEmpty()){
            throw new Exception("List empty");
        }else{
            E element= last.getInfo();
            Node<E> help=getNode(length-2);
            if(help==null){
                last=null;
            if(length==2){
                last=header;
            } else{
                header=null;
            }
            }else{
                last=null;
                last=help;
                last.setNext(null);
            }
            
            length--;
                return element;
            
        }
       
    }
    public E extract(Integer index)throws Exception{
        if(isEmpty()){
            throw new EstaVacia("La lista esta vacia");
        }
        else if(index.intValue() < 0 || index.intValue() == length){
            throw new IndexOutOfBoundsException("Fuera de rango");
        }
        else if(index.intValue() == 0){
            return extractFirst();
        }
        else if(index.intValue() == (length -1)){
            return extractLast();
        }
        else{
           Node<E> node_preview=getNode(index-1);
           Node<E> node_actually=getNode(index);
           E info=node_actually.getInfo();
           Node<E>help_next=node_actually.getNext();
           node_actually=null;
           node_preview.setNext(help_next);
           length--;
           return info;
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder("Lista data: "); //StringBuilder= anidas mas cadenas y sale solo una
        try{
            isEmpty();
            Node<E> help=header;
            while(help != null){
                sb.append(help.getInfo()); //append= anidir
                help=help.getNext();
            }
        } catch(Exception e){
            sb.append(e.getMessage());
        }
        return sb.toString();
    }
    public E get(int index) throws Exception {
    Node<E> node = getNode(index);
    return node.getInfo();
    }
    public int getTramite_Id() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  

}
