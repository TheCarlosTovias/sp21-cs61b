public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }

        return 1 + rest.size();
    }

    public int iterSize() {
        IntList p = this;
        int count = 0;
        while (p != null) {
            count++;
            p = p.rest;
        }
        return count;
    }

    public int get(int i) {
        IntList p = this;
        int count = 0;

        while (p != null) {
            if (count == i) {
                return p.first;
            } else {
                count++;
                p = p.rest;
            }
        }
        return -1;
    }

    public int getRecursive(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    public static void main(String[] args) {

        IntList L = new IntList(15, null);
        L = new IntList(10,L);
        L = new IntList(5,L);

        System.out.println(L.size());
        System.out.println(L.iterSize());
        System.out.println(L.get(0));
        System.out.println(L.get(1));
        System.out.println(L.get(2));
        System.out.println(L.getRecursive(0));
        System.out.println(L.getRecursive(1));
        System.out.println(L.getRecursive(2));
    }


}
