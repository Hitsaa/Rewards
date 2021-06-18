<!DOCTYPE html>
<html>
    <head>
        <title>Kiosk</title>
        <link rel="stylesheet" href="${resource(dir: 'css',file: 'bootstrap.min.css')}" type="text/css">
        <script src="javascript/respond.js"></script>
    </head>
    <body>
        <g:form url="[resource:customerInstance, action:'customerLookup']">
            <g:render template="kioskForm"/>
        </g:form>
        <g:javascript library="jquery"/>
        <script src="javascript/bootstrap.min.js"></script>
    </body>
</html>