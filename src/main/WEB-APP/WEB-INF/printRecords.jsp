<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Print Records</title>
    <style>
        @media print {
            body * {
                visibility: hidden;
            }
            #print-area, #print-area * {
                visibility: visible;
            }
            #print-area {
                position: absolute;
                left: 0;
                top: 0;
            }
        }
    </style>
</head>
<body>
    <div id="print-area">
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
    </div>
    <button onclick="window.print()">Print</button>
</body>
</html>
