class test2 <T>{
    public void display(String[] arr1){
        for(String R:arr1){
            System.out.println(R);
        }
    }

    public static void main(String[] args) {
        String str[]={"ABC","DEF","GHI"};
        Character arr[]={'A','B','C','D'};
        test2 obj2 =new test2();
        obj2.display(str);
        String[] arr1 = new String[0];
        obj2.display(arr1);

    }
}


