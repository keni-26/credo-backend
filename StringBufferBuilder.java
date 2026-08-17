public class StringBufferBuilder {

    public static void main(String[] args) {

        // STRINGBUFFER

        System.out.println("STRINGBUFFER");

        StringBuffer buffer = new StringBuffer("Java");

        System.out.println("Original : " + buffer);

        // 1. append()
        // Adds text at the end

        buffer.append(" Programming");

        System.out.println("After append : " + buffer);


        // 2. insert()
        // Adds text at a specific index

        buffer.insert(5, "Language ");

        System.out.println("After insert : " + buffer);


        // 3. replace()
        // Replaces characters between indexes


        buffer.replace(5, 13, "Code");

        System.out.println("After replace : " + buffer);

        // 4. delete()
        // Deletes characters between indexes

        buffer.delete(5, 10);

        System.out.println("After delete : " + buffer);


        // 5. deleteCharAt()
        // Deletes one character

        buffer.deleteCharAt(4);

        System.out.println("After deleteCharAt : " + buffer);


        // 6. reverse()
        // Reverses the StringBuffer

        buffer.reverse();

        System.out.println("After reverse : " + buffer);

        // 7. charAt()
        // Gets character at given index

        System.out.println("Character at index 2 : " + buffer.charAt(2));

        // 8. setCharAt()
        // Changes character at given index

        buffer.setCharAt(2, 'X');

        System.out.println("After setCharAt : " + buffer);

        // 9. length()
        // Returns number of characters

        System.out.println("Length : " + buffer.length());


        // 10. capacity()
        // Returns current capacity

        System.out.println("Capacity : " + buffer.capacity());


        // 11. substring()
        // Returns part of the StringBuffer

        System.out.println("Substring : "  + buffer.substring(2));

        // 12. indexOf()
        // Finds first occurrence

        System.out.println("Index of X : "  + buffer.indexOf("X"));

        // 13. lastIndexOf()
        // Finds last occurrence

        System.out.println("Last Index of a : " + buffer.lastIndexOf("a"));


        // STRINGBUILDER


        System.out.println("\nSTRINGBUILDER");

        StringBuilder builder = new StringBuilder("Java");

        System.out.println("Original : " + builder);


        // 1. append()

        builder.append(" Programming");

        System.out.println("After append : " + builder);

        // 2. insert()

        builder.insert(5, "Language ");

        System.out.println("After insert : " + builder);


        // 3. replace()

        builder.replace(5, 13, "Code");

        System.out.println("After replace : " + builder);

        // 4. delete()

        builder.delete(5, 10);

        System.out.println("After delete : " + builder);


        // 5. deleteCharAt()

        builder.deleteCharAt(4);

        System.out.println("After deleteCharAt : " + builder);

        // 6. reverse()

        builder.reverse();

        System.out.println("After reverse : " + builder);


        // 7. charAt()

        System.out.println("Character at index 2 : "  + builder.charAt(2));


        // 8. setCharAt()

        builder.setCharAt(2, 'X');

        System.out.println("After setCharAt : " + builder);

        // 9. length()

        System.out.println("Length : " + builder.length());


        // 10. capacity()

        System.out.println("Capacity : " + builder.capacity());


        // 11. substring()

        System.out.println("Substring : "  + builder.substring(2));

        // 12. indexOf()

        System.out.println("Index of X : "  + builder.indexOf("X"));


        // 13. lastIndexOf()

        System.out.println("Last Index of a : "  + builder.lastIndexOf("a"));
    }
}