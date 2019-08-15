<?php


class ProblemSixClass
{}
$homepage = file_get_contents('https://secure.nmi.com/hr/sequences.txt');
$S = "joint the nmi team";
echo $homepage;
$file =!null;$file -> $_FILES;

function findTheWords($homepage, $S){

}
if(strpos($homepage, $S) !== false) {
    return true;
}else {
    return false;
}

$homepage =('https://secure.nmi.com/hr/sequences.txt');
$S = "j";

if(findTheWords($homepage, $S)) {
    echo '<em>' . $S . '<em> is in the file</em>';
}else{
    echo '<em>' . $homepage . '</em> is not in the file';
}

$S2 = "jo";

if(findTheWords($homepage, $S2)) {
    echo '<em>' . $S2 . '<em> is in the file</em>';
}else{
    echo '<em>' . $homepage . '</em> is not in the file';
}

$S3 = "joi";

if(findTheWords($homepage, $S3)) {
    echo '<em>' . $S3 . '<em> is in the file</em>';
}else{
    echo '<em>' . $homepage . '</em> is not in the file';
}

$S4 = "join";

if(findTheWords($homepage, $S4)) {
    echo '<em>' . $S4 . '<em> is in the file</em>';
}else{
    echo '<em>' . $homepage . '</em> is not in the file';
}

//and so on and so on.
//This is perhaps one one of looking at it
//





