<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="js/style.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.min.js"></script>
  <script src="js/project.js"></script>
</head>
<body  ng-app="proapp" ng-controller="proctrl">

<div class="container">
  <h2>CREATE PROJECT</h2>
  <form>
     <div class="form-group">
      <label for="pwd">Project name</label>
      <input type="text" placeholder="Enter Project Name" ng-model="proname">
    </div>
    <button type="submit" class="btn btn-default" ng-click="prosave()">Submit</button>
  </form>
</div>

<div class="container">
  <h2>Add tasks to Project</h2>
  <form>
    <div class="dropdown">
        Projects:
        <select class="form-group"  ng-model="project" ng-options="projects.proName for projects in projectlist" ng-focus="prolist()">
        <option value=''>Select</option>
        </select>
    </div>
  <div class="form-group">
  
      <label for="pwd">Task tittle:</label>
      <input type="text" class="form-control"  ng-model="tittle" placeholder="Enter tittle">
    </div>
   <div class="form-group">
      <label for="pwd">Task description:</label>
      <input type="text" class="form-control"  ng-model="desc" placeholder="desc">
    </div>
    <button type="submit" class="btn btn-default"  ng-click="taskSave()">Submit</button>
  </form>
</div>

<div class="container">
  <h2>Employee Registration</h2>
  <form>
 	<div class="form-group">
      <label for="email">Emp Name:</label>
      <input type="text" class="form-control" ng-model="name"  placeholder="Enter name">
    </div>
	<div class="form-group">
      <label for="email">Emp Email:</label>
      <input type="text" class="form-control"  ng-model="email" placeholder="Enter email">
    </div>
    <div class="form-group">
      <label for="pwd">What am I doing today?:</label>
      <input type="text" class="form-control" ng-model="today"  placeholder="Enter today update">
    </div>
     <div class="form-group">
      <label for="pwd">What you did yesterday?:</label>
      <input type="text" class="form-control" ng-model="yesterday"  placeholder="Enter yesterdays update">
    </div>
     <div class="form-group">
      <label for="pwd">Are there any blockers to my work?:</label>
      <input type="text" class="form-control" ng-model="issues"  placeholder="Enter issues">
    </div>
    <button type="submit" class="btn btn-default" ng-click="empsave()">Submit</button>
  </form>
</div>

<div class="container">
  <h2>Task Assignment</h2>
   <form>
    <div class="dropdown">
        Projects:
        <select class="form-group"  ng-model="project" ng-options="projects.proName for projects in projectlist"  ng-change="tasklist()" >
        <option value=''>Select</option>
        </select>
    </div>
  <div class="dropdown">
        Tasks:
        <select class="form-group"  ng-disabled="!project"  ng-model="task" ng-options="task.taskId+ '-' + task.tittle for task in taskslist">
        <option value=''>Select</option>
        </select>
    </div>
   <div class="dropdown">
        Employees:
        <select class="form-group"  ng-model="emp" ng-options=" emp.empid+ '-' + emp.name for emp in employeelist" ng-focus="emplist()">
         <option value=''>Select</option>
        </select>
    </div>
    <button type="submit" class="btn btn-default"  ng-click="assigntask()">Submit</button>
  </form>
</div>
<div class="container">
  <h2>Employee Portal</h2>
   <form>
    	<div class="form-group">
      <label for="email">Empployee ID:</label>
      <input type="text" class="form-control" ng-model="employeeid"  placeholder="Enter employee ID" ng-click="emptask(employeeid)">
    </div>
     <div class="container" ng-show="prodata">
    <table class="table table-hover">
		  <tr>
			<th class="success">Project</th>
			<th class="info">TaskId</th>
			<th class="success">Tittle</th>
			<th class="info">Description</th>
			<th class="info">Status</th>
		  </tr>
		  <tr ng-repeat="x in emptaskslist" ng-class-even="'striped'">
		    <td>{{ x.project.proName }}</td>
			<td>{{ x.taskId }}</td>
			<td>{{ x.tittle }}</td>
		    <td>{{ x.description }}</td>
		    <td>
		     <div class="dropdown">
		        <select class="form-group"  ng-model="project">
		        <option value=''>{{ x.status }}</option>
		        <option value=''>InProgress</option>
		        <option value=''>Testing</option>
		        <option value=''>UAT Testing</option>
		        </select>
		   	</div>
		</td>
		
		<!-- 	<td>    <a href="" ng-click="edit(x)">update employee</a></td>
			<td>	<a href="" ng-click="delete(x)">delete employee</a></td>
		 -->  </tr>
		</table>
		 <button type="submit" class="btn btn-default"  ng-click="taskupdate()">Update</button>
 </div>
 
  </form>
</div>



</body>
</html>
