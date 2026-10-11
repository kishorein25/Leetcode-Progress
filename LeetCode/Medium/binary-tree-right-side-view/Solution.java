
        if(root == null){
            return new ArrayList<>();
        }

        rightside(root,res);
        return res;
    }
    public void rightside(TreeNode root, List<Integer> res){
        if(root == null) return;
        res.add(root.val);
        rightside(root.right,res);
    }
}
