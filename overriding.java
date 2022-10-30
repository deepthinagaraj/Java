// java


Exceptions - handle run time error


// Class physics

class Physics {

    // method say which is overridden method here

   public void say() {

      System.out.println("This is class Physics");

   }

}

// Class Topic

class Topic extends Physics {

    // method say which is overriding method here

   public void say() {

       // this will call say method of Physics Class

       super.say();

      System.out.println("This is class Topics");

   }

}

class Main {

   public static void main(String args[]) {

      Physics a = new Physics(); // Physics reference and object

      Physics b = new Topic(); // Physics reference but Topic object



      a.say(); // runs the method in Physics class

      b.say(); // runs the method in Topic class

   }

}

Output:

This is class Physics

This is class Physics

This is class Topics