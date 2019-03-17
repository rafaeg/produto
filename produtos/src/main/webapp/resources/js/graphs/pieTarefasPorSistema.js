google.load("visualization", "1", { packages: ["corechart"] });
google.setOnLoadCallback(pieTarefasPorSistemaAdm);
google.setOnLoadCallback(pieTarefasPorSistemaImp);
google.setOnLoadCallback(pieTarefasPorSistemaMan);

function pieTarefasPorSistemaAdm() {
    var jsonData = $.ajax({
        url: "./backend/json/graphs/pieTarefasPorSistema.json.php?t=3",
        dataType: "json",
        async: false
    }).responseText;

    var data = new google.visualization.DataTable(jsonData);
    data.addColumn('string', 'Dev');
    data.addColumn('number', 'QtdTarefas');

    var array = $.parseJSON(jsonData);
    for (var i = 0; i < array.length; i++) {
        data.addRows([[array[i]['Sistema'], parseInt(array[i]['QtdTarefas'])]]);
    }

    var options = {
        width: 450,
        height: 300,
        is3D: true
    };

    var chart = new google.visualization.PieChart(document.getElementById('pieTarefasPorSistemaAdm'));
    chart.draw(data, options);
}

function pieTarefasPorSistemaImp() {
    var jsonData = $.ajax({
        url: "./backend/json/graphs/pieTarefasPorSistema.json.php?t=2",
        dataType: "json",
        async: false
    }).responseText;

    var data = new google.visualization.DataTable(jsonData);
    data.addColumn('string', 'Dev');
    data.addColumn('number', 'QtdTarefas');

    var array = $.parseJSON(jsonData);
    for (var i = 0; i < array.length; i++) {
        data.addRows([[array[i]['Sistema'], parseInt(array[i]['QtdTarefas'])]]);
    }

    var options = {
        width: 450,
        height: 300,
        is3D: true
    };

    var chart = new google.visualization.PieChart(document.getElementById('pieTarefasPorSistemaImp'));
    chart.draw(data, options);
}

function pieTarefasPorSistemaMan() {
    var jsonData = $.ajax({
        url: "./backend/json/graphs/pieTarefasPorSistema.json.php?t=1",
        dataType: "json",
        async: false
    }).responseText;

    var data = new google.visualization.DataTable(jsonData);
    data.addColumn('string', 'Dev');
    data.addColumn('number', 'QtdTarefas');

    var array = $.parseJSON(jsonData);
    for (var i = 0; i < array.length; i++) {
        data.addRows([[array[i]['Sistema'], parseInt(array[i]['QtdTarefas'])]]);
    }

    var options = {
        width: 450,
        height: 300,
        is3D: true
    };

    var chart = new google.visualization.PieChart(document.getElementById('pieTarefasPorSistemaMan'));
    chart.draw(data, options);
}