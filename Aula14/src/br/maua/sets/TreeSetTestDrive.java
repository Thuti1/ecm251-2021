package br.maua.sets;

import java.util.Set;
import br.maua.models.Item;
import br.maua.models.ItemComparable;

import java.util.TreeSet;

public class TreeSetTestDrive {
    public static void main(String[] args){
        Set<Item> itemSet = new TreeSet<>(new ItemComparable());
        //Adiciona os itens no Set
        itemSet.add(new Item("Maca",1));
        itemSet.add(new Item("Pera",2));
        itemSet.add(new Item("Maca",1));
        itemSet.add(new Item("Banana",3));

        //Passa pelos Itens
        itemSet.forEach(item -> System.out.println(item));
    }
}
