<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<!-- start: Meta -->
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<meta name="description" content="LBPOI Analysis framework">
<meta name="author" content="Pubudu lasal Dissanayake">
<!-- end: Meta -->

<!-- start: CSS -->
<link id="bootstrap-style" href="/LocationBasedPOIAnalytics/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="/LocationBasedPOIAnalytics/resources/css/bootstrap-responsive.min.css"
	rel="stylesheet">
<link id="base-style" href="/LocationBasedPOIAnalytics/resources/css/style.css" rel="stylesheet">
<link id="base-style-responsive"
	href="/LocationBasedPOIAnalytics/resources/css/style-responsive.css" rel="stylesheet">
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&amp;subset=latin,cyrillic-ext,latin-ext'
	rel='stylesheet' type='text/css'>

<!-- end: CSS -->
</head>

<body>
	<table border="1" cellpadding="2" cellspacing="2" align="center">
		<tr>
			<td height="30" colspan="2"><tiles:insertAttribute name="header" />
			</td>
		</tr>
		<tr>
			<td height="250"><tiles:insertAttribute name="menu" />
			</td>
			<td width="350"><tiles:insertAttribute name="body" />
			</td>
		</tr>
		<tr>
			<td height="30" colspan="2"><tiles:insertAttribute name="footer" />
			</td>
		</tr>
	</table>
</body>
</html>
