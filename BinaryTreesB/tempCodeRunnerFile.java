 // public static int height(Node root){
    //     if(root == null){
    //         return 0;
    //     }

    //     int lh = height(root.left);
    //     int rh = height(root.right);
    //     return Math.max(lh, rh) +1;
    // }

    // // COUNT NODES

    // public static int count(Node root){
    //     if(root == null){
    //         return 0;
    //     }

    //     int leftCount = count(root.left);
    //     int rightCount = count(root.right);
    //     return leftCount + rightCount +1 ;
    // }


    // // SUM OF NODES

    // public static int sum (Node root){
    //     if(root == null){
    //         return 0;
    //     }

    //     int leftSum = sum(root.left);
    //     int rightSum = sum(root.right);
    //     return leftSum + rightSum +root.data;
    // }


    // //DIAMETER OF TREE        APPOCH 1


    // public static int diameter2(Node root){
    //     if(root == null){
    //         return 0;
    //     }

    //     int leftDiam = diameter2(root.left);
    //     int leftHt = height(root.left);
    //     int rightDiam = diameter2(root.right);
    //     int rightHt = height(root.right);

    //     int selfDiam = leftHt + rightHt + 1;

    //     return  Math.max(selfDiam, Math.max(leftDiam, rightDiam));
        
    // }