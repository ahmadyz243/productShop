<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="../js/jquery.js"></script>
    <title>Edit or Add Product</title>
</head>
<body>

    <form action="/admin/edit-product" method="post" enctype="multipart/form-data">

        <label for="name">name: </label>
        <input id="name" name="name" type="text">

        <label for="price">price: </label>
        <input id="price" name="price" type="number">

        <label for="inventory">inventory: </label>
        <input id="inventory" name="inventory" type="number">

        <label for="image">image: </label>
        <input id="image" name="image" type="file" accept="image/*">

        <p>attributes: </p>

        <div id="propertyValue">
            <input id="prop1" name="prop1" type="text" placeholder="property">
            <input id="val1" name="val1" type="text" placeholder="value">
        </div>
        <button id="addPropertyBtn" type="button">add another property</button>
        <input id="propertiesCount" name="propertiesCount" type="number" value="1" hidden>
        <button type="submit">submit</button>
    </form>

    <script type="text/javascript" src="../js/admin.js"></script>
</body>
</html>
