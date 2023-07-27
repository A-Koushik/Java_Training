import java.util.*;
// class lists
// {
//     public static void main(String[] args)
//     {
//         ArrayList<Integer> list=new ArrayList<Integer>(); //int list[]=new int[3];
//         list.ensureCapacity(2);
//         list.add(1);
//         list.add(2);
//         list.add(1);
//         list.add(2);
//         list.add(1);
//         list.add(2);
//         list.add(1);
//         list.add(2);
//         list.add(1);
//         list.add(2);
//         list.add(1);
//         list.add(2);
//         list.add(1);
//         list.add(2);
//         System.out.println(list.get(0));
//         Iterator<Integer> itr=list.iterator();
//         while(itr.hasNext())
//             System.out.print(itr.next()+" ");
//         System.out.println();
//         System.out.println(list.size());
//     }
// }

import java.lang.reflect.Method;

public class lists {
    public static void main(String[] args) {
        // Replace "ClassName" with the name of the predefined class you want to inspect
        Class<?> clazz = ArrayList.class;

        Method[] methods = clazz.getDeclaredMethods();

        System.out.println("Methods present in the class " + clazz.getName() + ":");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}


// import java.lang.reflect.Method;
// import java.lang.reflect.Parameter;

// public class lists {
//     public static void main(String[] args) {
//         // Replace "ClassName" with the name of the predefined class you want to inspect
//         Class<?> clazz = ArrayList.class;

//         Method[] methods = clazz.getDeclaredMethods();

//         System.out.println("Methods present in the class " + clazz.getName() + ":");
//         for (Method method : methods) {
//             System.out.print(method.getName() + "(");

//             Parameter[] parameters = method.getParameters();
//             for (int i = 0; i < parameters.length; i++) {
//                 Parameter parameter = parameters[i];
//                 System.out.print(parameter.getType().getSimpleName() + " " + parameter.getName());
//                 if (i < parameters.length - 1) {
//                     System.out.print(", ");
//                 }
//             }

//             System.out.println(")");
//         }
//     }
// }
