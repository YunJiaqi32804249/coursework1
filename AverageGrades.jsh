jshell> int[] average_grades(int[][] grades, int[] weights) {
   ...>         int[] averages = new int[grades.length];
   ...>         for (int i = 0; i < grades.length; i++) {
   ...>                 int weightedSum = 0;
   ...>                 for (int j = 0; j < grades[i].length; j++) {
   ...>                         weightedSum += grades[i][j] * weights[j];
   ...>                 }
   ...>                 averages[i] = weightedSum / 100;
   ...>         }
   ...>         return averages;
   ...> }
|  已创建 方法 average_grades(int[][],int[])

jshell> average_grades(new int[][]{{51, 83, 28}, {0, 38, 95}}, new int[]{30, 40, 30});
$2 ==> int[2] { 56, 43 }