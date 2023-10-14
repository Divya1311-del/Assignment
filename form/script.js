function getValue(){
    var firstname = document.getElementById("firstname").value;
    
    var lastname = document.getElementById("lastname").value;
    var birthday = document.getElementById("birthday").value;
    
    var country = document.getElementById("country").value;
    
   
    
    var Email = document.getElementById("Email").value;
    var profession = document.getElementById("profession").value;
    var phone = document.getElementById("phone").value;
    var gender_male = document.getElementById("gender_male").value;
    var gender_female = document.getElementById("gender_female").value;
    
    if(document.getElementById('gender_male').checked){
        document.getElementById("disp").innerHTML=document.write("Gender:"+gender_male+"<br>");
        }
    else if(document.getElementById('gender_female').checked){
        document.getElementById("disp").innerHTML=document.write("Gender:"+gender_female+"<br>");
        }
    else{
            alert("please select gender");
    }    
    document.writeln("firstname   :"+firstname+"<br>");
    document.writeln("Lastname   :"+lastname+"<br>");
    document.writeln("Dob        :"+birthday+"<br>");
    document.writeln("Country    :"+country+"<br>");
    document.writeln("Email      :"+Email+"<br>");
    document.writeln("Profession :"+profession+"<br>");
    document.writeln("Mobile     :"+phone+"<br>");
   
    }
   
    
    
    
    
  
    
    
    
   
    

    
   
    
    
    
    
    
    