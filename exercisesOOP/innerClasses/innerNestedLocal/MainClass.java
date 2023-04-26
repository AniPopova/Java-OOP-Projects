package exercisesOOP.innerClasses.innerNestedLocal;

import exercisesOOP.innerClasses.innerNestedLocal.OuterClass;

public class MainClass {

  public static void main(String[] args) {

    OuterClass outer = new OuterClass(); //за да достъпим вметодите на въшния клас трябва да направим инстанция на клас
    outer.heyThere(); // със инстранцията викаме методите на класа именно защото не са STATIC!!!

    //ВЪТРЕШЕН КЛАС = INNER CLASS
    OuterClass.InnerClass inner = outer.new InnerClass(); //по този начин достъпваме вътрешния клас, който не е статичен - чрез външния клас
    //InnerClass inner = outer.new InnerClass(); - НЕ МОЖЕ ДА ПРАВИМ ИНСТАНЦИЯ ПО ТОЗИ НАЧИН!
    inner.whatsUp();//вече може да извикваме методите на вътрешния клас

    //ВЛОЖЕН КЛАС = NESTED CLASS
    // NestedClass nestedThing = new NestedClass(); //когато класа е вложен(nested) можем директно да създаваме инстанция
    OuterClass.NestedClass nestedThing = new OuterClass.NestedClass();
    nestedThing.hello(); // като имаме инстанция можем да викаме нейните методи

    /*USAGE INNER CLASSES
    Когато започнем да пишем големи програми и ни трябва клас,
    който има смисъл само за нещо специфични и конкретно за друг клас можем да използваме и вложените класове!!!
    */
  }
}
