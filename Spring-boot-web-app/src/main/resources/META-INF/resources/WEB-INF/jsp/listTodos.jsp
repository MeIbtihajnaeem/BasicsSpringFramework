<%@ include file="commons/header.jspf"%>

<%@ include file="commons/navigation.jspf"%>
<div class="container">
	<div>Welcome ${name}</div>
	<table class="table">
		<thead>
			<tr>
				<th>Description</th>
				<th>Target date</th>
				<th>is Done?</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
					<td><a href="delete-todo?id=${todo.id} "
						class="btn btn-warning">Delete </a></td>

					<td><a href="update-todos?id=${todo.id} "
						class="btn btn-primary">Update </a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="add-todo" class="btn btn-success">Add Todo</a>
</div>
<%@ include file="commons/footer.jspf"%>
