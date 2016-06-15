/**
 * 
 * @returns {Boolean}
 */
 function validate() {
	 alert('validate');
	 if(document.myForm.name.value == null || document.myForm.name.value == "" )
     {
        alert ( "Please provide your name!" );
       
        document.myForm.name.focus() ;
        return false;
     }

	else if( document.myForm.adress.value == "" || document.myForm.adress.value == null  )
     {
        alert( "Please provide your adress!" );
        document.myForm.adress.focus() ;
        return false;
     }
	 else if( document.myForm.pan.value == ""|| document.myForm.pan.value == null )
     {
        alert( "Please provide your pan!" );
        document.myForm.pan.focus() ;
        return false;
     }
	 else if( document.myForm.assesment.value == ""||document.myForm.assesment.value == null )
     {
        alert( "Please provide your assesment!" );
        document.myForm.assesment.focus() ;
        return false;
     }
	 else if( document.myForm.income.value == ""||document.myForm.income.value == null)
     {
        alert( "Please provide your income!" );
        document.myForm.income.focus() ;
        return false;
     }
     else if(isNaN(document.myForm.income.value) )
     {
        alert( "This field should not contain Alphabets!" );
        document.myForm.income.focus() ;
        return false;
     }
     else if( document.myForm.tds.value == ""|| document.myForm.tds.value == null )
     {
        alert( "Please provide your tds!" );
        document.myForm.tds.focus() ;
        return false;
     }
     else if(isNaN(document.myForm.tds.value))
     {
        alert( "This field should not contain Alphabets!" );
        document.myForm.tds.focus() ;
        return false;
     }
	 else if( document.myForm.tax.value == "" || document.myForm.tax.value == null )
     {
        alert( "Please provide your tax!" );
        document.myForm.tax.focus() ;
        return false;
     } 
     else if(isNaN(document.myForm.tax.value))
     {
        alert( "This field should not contain Alphabets!" );
        document.myForm.tax.focus() ;
        return false;
     } 
     else if( document.myForm.income.value < document.myForm.tax.value){
    	 
    	 alert("Income Should be greater than Tax");
    	 document.myForm.tax.focus() ;
         return false;
     }
	 
     else if( isNAN( document.myForm.income.value)){
    	 
    	 alert("Income Shoul be greater than Tax");
    	 document.myForm.income.focus() ;
         return false;
     }
	
 }
