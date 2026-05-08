class Main {
    public static void main(String[] args) {
        int [] a={3,7,5,2,9};
        int l=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>l)
            l=a[i];
        }
        System.out.println("largest elem : "+l);
    }
}
