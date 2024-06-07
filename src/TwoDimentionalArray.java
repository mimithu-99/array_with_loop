public class TwoDimentionalArray {
    public static void main(String[] args) {

        int [] [] number = new  int [3] [3];

        number [0] [0] = 10;
        number [0] [1] = 20;
        number [0] [2] = 30;

        number [1] [0] = 40;
        number [1] [1] = 50;
        number [1] [2] = 60;

        number [2] [0] = 70;
        number [2] [1] = 80;
        number [2] [2] = 90;



        System.out.println(number[0] [0]);
        System.out.println(number[0] [1]);
        System.out.println(number[0] [2]);
        System.out.println(number[1] [0]);
        System.out.println(number[1] [1]);
        System.out.println(number[1] [2]);
        System.out.println(number[2] [0]);
        System.out.println(number[2] [1]);
        System.out.println(number[2] [2]);


    }
}
/*

public class TwoDimensionalArray { // একটি পাবলিক ক্লাস 'TwoDimensionalArray' ঘোষণা করা হয়েছে।
    public static void main(String[] args) { // 'main' মেথড ঘোষণা করা হয়েছে, যা প্রোগ্রামের এন্ট্রি পয়েন্ট।

        int[][] number = new int[3][3]; // 3 সারি এবং 3 কলাম বিশিষ্ট একটি দ্বিমাত্রিক int অ্যারে 'number' তৈরি করা হল।

        number[0][0] = 10; // 'number' অ্যারের প্রথম সারির প্রথম কলামে (row 0, column 0) 10 মান সেট করা হল।
        number[0][1] = 20; // 'number' অ্যারের প্রথম সারির দ্বিতীয় কলামে (row 0, column 1) 20 মান সেট করা হল।
        number[0][2] = 30; // 'number' অ্যারের প্রথম সারির তৃতীয় কলামে (row 0, column 2) 30 মান সেট করা হল।

        number[1][0] = 40; // 'number' অ্যারের দ্বিতীয় সারির প্রথম কলামে (row 1, column 0) 40 মান সেট করা হল।
        number[1][1] = 50; // 'number' অ্যারের দ্বিতীয় সারির দ্বিতীয় কলামে (row 1, column 1) 50 মান সেট করা হল।
        number[1][2] = 60; // 'number' অ্যারের দ্বিতীয় সারির তৃতীয় কলামে (row 1, column 2) 60 মান সেট করা হল।

        number[2][0] = 70; // 'number' অ্যারের তৃতীয় সারির প্রথম কলামে (row 2, column 0) 70 মান সেট করা হল।
        number[2][1] = 80; // 'number' অ্যারের তৃতীয় সারির দ্বিতীয় কলামে (row 2, column 1) 80 মান সেট করা হল।
        number[2][2] = 90; // 'number' অ্যারের তৃতীয় সারির তৃতীয় কলামে (row 2, column 2) 90 মান সেট করা হল।

        // নিচের লাইনগুলোতে 'number' অ্যারের প্রতিটি মান পৃথক পৃথকভাবে প্রদর্শন করা হবে:
        System.out.println(number[0][0]); // 'number' অ্যারের প্রথম সারির প্রথম কলামের মান প্রদর্শন করা হচ্ছে, যা 10।
        System.out.println(number[0][1]); // 'number' অ্যারের প্রথম সারির দ্বিতীয় কলামের মান প্রদর্শন করা হচ্ছে, যা 20।
        System.out.println(number[0][2]); // 'number' অ্যারের প্রথম সারির তৃতীয় কলামের মান প্রদর্শন করা হচ্ছে, যা 30।
        System.out.println(number[1][0]); // 'number' অ্যারের দ্বিতীয় সারির প্রথম কলামের মান প্রদর্শন করা হচ্ছে, যা 40।
        System.out.println(number[1][1]); // 'number' অ্যারের দ্বিতীয় সারির দ্বিতীয় কলামের মান প্রদর্শন করা হচ্ছে, যা 50।
        System.out.println(number[1][2]); // 'number' অ্যারের দ্বিতীয় সারির তৃতীয় কলামের মান প্রদর্শন করা হচ্ছে, যা 60।
        System.out.println(number[2][0]); // 'number' অ্যারের তৃতীয় সারির প্রথম কলামের মান প্রদর্শন করা হচ্ছে, যা 70।
        System.out.println(number[2][1]); // 'number' অ্যারের তৃতীয় সারির দ্বিতীয় কলামের মান প্রদর্শন করা হচ্ছে, যা 80।
        System.out.println(number[2][2]); // 'number' অ্যারের তৃতীয় সারির তৃতীয় কলামের মান প্রদর্শন করা হচ্ছে, যা 90।

    }
}
এই কোড ব্লকে, একটি 3x3 দ্বিমাত্রিক অ্যারে তৈরি করা হয়েছে এবং এতে মানগুলো সেট করা হয়েছে। প্রতিটি মান পৃথকভাবে প্রদর্শনের জন্য System.out.println() ব্যবহার করা হয়েছে।
 */