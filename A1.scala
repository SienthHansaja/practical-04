object A1{

    def displayInventory (names:Array[String],quantity:Array[Int]): Unit={
        var n:Int = names.length -1;
        for (i <-0 to n){
            println (names(i)+" = "+quantity(i));
        }
    }

    def RestockItem (names:Array[String],quantity:Array[Int], name:String, k:Int):Unit={
        var n:Int = names.length -1;
        var ItemFound:Boolean = false;
        for (i<- 0 to n){
            if(name == names(i)){
                quantity(i)+=k;
                ItemFound = true;
            }
        }
        if(ItemFound == false){
            println("The item is not in stock");
        }
    }

    def SellItem (names:Array[String],quantity:Array[Int], name:String, k:Int):Unit={
        var n:Int = names.length -1;
        var ItemFound:Boolean = false;
        for (i<- 0 to n){
            if(name == names(i)){
                if (quantity(i)>= k){
                    quantity(i)-=k;
                    
                }else{
                    println("the product quantity is not enough")
                }
                ItemFound = true;
            }
        }
        if(ItemFound == false){
            println("The item is not in stock");
        }
    }

    def main(args: Array[String]):Unit = {
        var names:Array[String] = Array("Pencil","Eraser","Pen","Book","Highlighter");
        var quantities: Array[Int] = Array(150,100,200,50,20);
        
        RestockItem(names,quantities,"Book",10);
        RestockItem(names,quantities,"Mobile",10);

        println ("\n\t\tInventory");
        displayInventory(names,quantities);

        SellItem(names,quantities,"Pen",100);
        SellItem(names,quantities,"Highlighter",30);
        
        println ("\n\t\tInventory");
        displayInventory(names,quantities);
    } 
}