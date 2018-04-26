



public void Test(){

  List<Item> list = new ArrayList<Item>();
  PersonDo item1 = new Item("it1", 1);  
  PersonDo item2 = new Item("it2", 2);  
  PersonDo item3 = new Item("it3", 3); 
  
  list.add(item1);
  list.add(item2);
  list.add(item3);
  
  list.stream().filter(()->item.age()>2);
  

}
