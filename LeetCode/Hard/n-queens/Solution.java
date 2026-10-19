    public static void solve(List<List<String>> output,char[][] arr,int n,int row){

    }
        return 1;

        }
            }

        if(row == n){
            List<String> solution = new ArrayList<>();

            for(char sol[] : arr){
                solution.add(new String(sol));
            }

            output.add(solution);

        }else{
            for(int col=0;col<n;col++){
                    if(isSafe(arr,row,col,n)==1){
                    arr[row][col]='Q';
                    solve(output,arr,n,row+1);
                    arr[row][col]='.';
                }
            }
        }
