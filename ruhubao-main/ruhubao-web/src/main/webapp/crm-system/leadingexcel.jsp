<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<html>
 <head>   
   <!--  <script type="text/javascript" src="../js/jquery-1.7.1.js"></script>  -->
    <script type="text/javascript" src="../js/jquery2.01.js"></script> 
    <script type="text/javascript" src="js/jquery.form.js"></script>     
    <script type="text/javascript">  
   
           /*  ajax 方式上传文件操作 */  
             $(document).ready(function(){ 
                $("#btn").click(function(){ if(checkData()){  
                        $('#form1').ajaxSubmit({    
                            url:'../data/customer/ajax',  
                            dataType: 'text',  
                            success: resutlMsg,  
                            error: errorMsg  
                        });   
                        function resutlMsg(msg){  
                            alert(msg);     
                            $("#upfile").val("");  
                        }  
                        function errorMsg(){   
                            alert("导入excel出错！");      
                        }  
                    }   
                });  
             });  
               
             //JS校验form表单信息  
             function checkData(){  
                var fileDir = $("#upfile").val();  
                var suffix = fileDir.substr(fileDir.lastIndexOf("."));  
                if("" == fileDir){  
                    alert("选择需要导入的Excel文件！");  
                    return false;  
                }  
                if(".xls" != suffix && ".xlsx" != suffix ){  
                    alert("选择Excel格式的文件导入！");  
                    return false;  
                }  
                return true;  
             }   
    </script>   
   </head>
  <body>  
 
    <form method="POST"  enctype="multipart/form-data" id="form1" action="../data/customer/uploadExcel">  
       
             <label>上传文件: </label>
             <input id="upfile" type="file" name="upfile"><br> <br> 
       
            <input type="submit" value="表单提交" onclick="return checkData()">
            <input type="button" value="ajax提交" id="btn" name="btn" >  

    </form>       
  </body>  
</html>  