                return 0;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; 
        i--, j++) {
            if (arr[i][j] == 'Q')
                return 0;
        }
        return 1;
    }

    public static void solve(List<List<String>> output, char[]
    [] arr, int n, int row) {
        if (row == n) {
            List<String> Solution = new ArrayList<>();
            for (char[] sol : arr) {
                Solution.add(new String(sol));
            }
            output.add(Solution);

        } else {
            for (int col = 0; col < n; col++) {
                if (issafe(arr, col, row, n) == 1) {
                    arr[row][col] = 'Q';
                    solve(output, arr, n, row + 1);
                    arr[row][col] = '.';
