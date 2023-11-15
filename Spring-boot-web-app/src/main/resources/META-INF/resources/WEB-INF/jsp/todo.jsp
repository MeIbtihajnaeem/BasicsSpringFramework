<%@ include file="commons/header.jspf"%>
<%@ include file="commons/navigation.jspf"%>
<div class="container">
	<div>Enter todo details</div>
	<form:form method="post" modelAttribute="todo">
		<fieldset class="mb-3">
			<form:label path="description">Description</form:label>
			<form:input type="text" path="description" required="required" />
			<form:errors cssClass="text-warning" path="description" />
		</fieldset>

		<fieldset class="mb-3">
			<form:label path="targetDate">Target Date</form:label>
			<form:input type="text" path="targetDate" required="required" />
			<form:errors cssClass="text-warning" path="targetDate" />
		</fieldset>


		<form:input type="hidden" path="id" />
		<form:input type="hidden" path="done" />
		<input type="submit" class="btn btn-success" />
	</form:form>
</div>

<%@ include file="commons/footer.jspf"%>
<script type="text/javascript">
	$('#targetDate').datepicker({

		format : 'yyyy-mm-dd'

	});
</script>