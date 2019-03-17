google.load("visualization", "1", { packages: ["corechart"] });
google.setOnLoadCallback(pieAllTipo);

function pieAllTipo() {
    var jsonData = $.ajax({
        url: "./backend/json/graphs/pieAllTipo.json.php",
        dataType: "json",
        async: false
    }).responseText;

    var data = new google.visualization.DataTable(jsonData);
    data.addColumn('string', 'Tipo');
    data.addColumn('number', 'QtdTarefas');

    var array = $.parseJSON(jsonData);
    for (var i = 0; i < array.length; i++) {
        data.addRows([[array[i]['TipoTarefa'], parseInt(array[i]['QtdTarefas'])]]);
    }

    var options = {
        width: 450,
        height: 300,
        is3D: true
    };

    var chart = new google.visualization.PieChart(document.getElementById('pieAllTipo'));
    chart.draw(data, options);
}