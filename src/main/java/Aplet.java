
<!DOCTYPE html>
<html>
<head>
<style>
#text {
    position: absolute;
    font-size: 24px;
    color: green;
}
</style>
</head>
<body>

<div id="text">Hello World</div>

    <script>
            let x = 0;
const text = document.getElementById("text");

    setInterval(() => {
    x += 10;
    if (x > window.innerWidth) x = 0;
    text.style.left = x + "px";
}, 100);
</script>

</body>
</html>

}
