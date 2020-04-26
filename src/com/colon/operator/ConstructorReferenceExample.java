/*
 * package com.colon.operator;
 * 
 * import java.util.List; import java.util.ArrayList;
 * 
 * public class Zoo { private List animalList; public Zoo(List animalList) {
 * this.animalList = animalList; System.out.println("Zoo created."); } }
 * 
 * public interface ZooFactory { Zoo getZoo(List animals); }
 * 
 * public class ConstructorReferenceExample {
 * 
 * public static void main(String[] args) { //following commented line is lambda
 * expression equivalent //ZooFactory zooFactory = (List animalList)-> {return
 * new Zoo(animalList);}; ZooFactory zooFactory = Zoo::new;
 * System.out.println("Ok"); Zoo zoo = zooFactory.getZoo(new ArrayList()); } }
 */