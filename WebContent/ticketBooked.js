/**
 * print operations to be included in the final page
 */
function printPage(){
	var printbtn=document.getElementById("print");
	printbtn.style.visibility = 'hidden';
    //Print the page content
    window.print()
    //Set the print button to 'visible' again 
    //[Delete this line if you want it to stay hidden after printing]
    printbtn.style.visibility = 'visible';
}