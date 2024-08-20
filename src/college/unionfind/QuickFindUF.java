package college.unionfind;

public class QuickFindUF{
    private int[] id;
    public QuickFindUF(){
        int n=10;
        id=new int[n];
        for(int i=0;i<n;i++){
            id[i]=i;
        }
    }

    /*public boolean connected(int p, int q){
        return id[p]==id[q];
    }*/

    public void union(int p, int q) {
        for (int i = 0; i < id.length; i++) {
            if (id[i]==id[p]){
                id[i]=id[q];
            }
        }
        for(int i=0;i<id.length;i++){
            System.out.print(id[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickFindUF uf = new QuickFindUF();
        for(int i=0;i<8;i++){
            uf.union(i+1,i+2);
        }
    }
}
