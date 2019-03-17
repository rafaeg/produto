var jsonData = $.ajax({
    url: "./backend/json/graphs/tabDevsPorTipoTarefa.json.php",
    dataType: "json",
    async: false
}).responseText;

var a = $.parseJSON(jsonData);

for (var i = 0; i < a.length; i++) {
    $('#tabDevsPorTipoTarefa tbody').append('<tr><td>'+a[i]["nome"]+'</td><td>'+a[i]["Administrativo"]+'</td><td>'+a[i]["Implementacao"]+'</td><td>'+a[i]["Manutencao"]+'</td></tr>');
}   