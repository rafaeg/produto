google.load("visualization", "1", { packages: ["corechart"] });
google.setOnLoadCallback(columnTarefasPorSistema);

function columnTarefasPorSistema() {
    var jsonData = $.ajax({
        url: "./backend/json/graphs/columnTarefasPorSistema.json.php",
        dataType: "json",
        async: false
    }).responseText;

    var data = new google.visualization.DataTable(jsonData);
    data.addColumn('string', 'Sistema');
    data.addColumn('number', 'Administrativo');
    data.addColumn('number', 'Implementação');
    data.addColumn('number', 'Manutenção');

    var array = $.parseJSON(jsonData);
    for (var i = 0; i < array.length; i++) {
        data.addRows([
                [
                    array[i]['Sistema'], 
                    parseInt(array[i]['Adm']), 
                    parseInt(array[i]['Imp']), 
                    parseInt(array[i]['Man'])
                ]
            ]);
    }

    var options = {
        
    };

    var chart = new google.visualization.ColumnChart(document.getElementById('columnTarefasPorSistema'));
    chart.draw(data, options);
}