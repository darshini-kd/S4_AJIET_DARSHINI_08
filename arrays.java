class Main {
    public static void main(String[] args) {
        int [] a={3,7,5,2,9};
        int s=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<s)
            s=a[i];
        }
        System.out.println("smallest elem : "+s);
    }
}
