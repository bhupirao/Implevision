<?php

     
function isPal($str){
   
    $str=strtolower(preg_replace("/[^a-zA-Z0-9]/","",$str));

    $left=0;
    $right=strlen($str)-1;

    while($left<$right){

        if($str[$left]!=$str[right]){
            return false;
        }
        
        $left++;
        $right--;
    }

    return true;


}

$str="malayalam";

echo isPal($str) ? "Yes":"No";


?>