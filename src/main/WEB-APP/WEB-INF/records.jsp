<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Records</title>
</head>
<body>
    <h1>Records</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Value</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="record" items="${records}">
                <tr>
                    <td>${record.id}</td>
                    <td>${record.name}</td>
                    <td>${record.value}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <button onclick="window.location.href='/records/export/pdf'">Export to PDF</button>
    <button onclick="window.location.href='/records/export/excel'">Export to Excel</button>
    <button onclick="window.location.href='/records/export/csv'">Export to CSV</button>
    <button onclick="window.print()">Print</button>
</body>
</html>
