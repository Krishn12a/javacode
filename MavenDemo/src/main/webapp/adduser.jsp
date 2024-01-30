
<jsp:include page="include/header.jsp"/>
<h1> Add New User</h1>

<form action="home" method="post">
<div style="background-color:aqua;border:1px solid red; padding:5px;">
	<div style="padding:5px;"> 
	Enter your User Name : <input type="text" name="username" required="required"/> 
	</div>
	<div style="padding:5px;"> 
	Enter your User Email : <input type="email" name="email" required="required"/> 
	</div>
	<div>
		<input type="hidden" name="form" value="adduseroperation">
	</div>
	<div>
	<input type="submit" style="background-color:blue; color:white" value="Add User"/>
	</div>
</div>

</form>
<jsp:include page="include/footer.jsp"/>
