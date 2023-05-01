public class Puzzle {
    public static void main(String[] args) {
        System.out.println(puzzle(14,10));
    }

    private static int puzzle(int base, int limit) {
        if (base > limit)
        {
            return -1;
        }
        else{
            if (base == limit)
                return 1;
            else
                return base * puzzle(base +1, limit);
        }

    }
}
