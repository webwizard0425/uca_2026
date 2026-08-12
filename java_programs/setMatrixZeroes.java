class setMatrixZeroes {
    public void setZeroes(int[][] mat) {
        boolean fc=false , fr = false;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    if(i==0)fr=true;
                    if(j==0)fc=true;
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }
        for(int i=1;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++)if(mat[i][0]==0)mat[i][j]=0;
        }
        for(int i=1;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++)if(mat[0][i]==0)mat[j][i]=0;
        }
        if(fr==true)for(int i=0;i<mat[0].length;i++)mat[0][i]=0;
        if(fc==true)for(int i=0;i<mat.length;i++)mat[i][0]=0;
    }
}