$(document).ready(function (){

    // events --------------------------------------------------------------------------
    $("#addProductBtn").click(function (){
        window.location.replace("/admin/editProductPage");
    })

    $("#addPropertyBtn").click(function (){
        let propertiesCount = $("#propertiesCount").val();
        let previousProperty = $("#prop" + propertiesCount).val();
        let previousValue = $("#val" + propertiesCount).val();
        if(previousProperty === "" || previousValue === ""){
            alert("please complete previous property");
        }else{
            propertiesCount++;
            $("#propertiesCount").removeAttr("value");
            $("#propertiesCount").val(propertiesCount);
            console.log($("#propertiesCount").val());
            $("#propertyValue").append("<input id='prop" + propertiesCount + "' name='prop" + propertiesCount + "' type=\"text\" placeholder=\"property\">" +
                "<input id='val" + propertiesCount + "' name='val" + propertiesCount + "' type=\"text\" placeholder=\"value\">");
        }

    })

    // functions -----------------------------------------------------------------------


});