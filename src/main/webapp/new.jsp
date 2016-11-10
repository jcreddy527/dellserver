<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="js/style.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	angular.module('count',[]).controller('ctrl', function($scope,$http) {

		var  uri = 'http://localhost:8080/SpringRestfulWebServicesWithJSONExample/countries';
		$http({
			method :'GET',
			url : uri,
			}).success(
				function(data){
					if(data){
						$scope.countries=data.countryList;
						alert(data.countryList);
						}else{
							console.log(data);
							}
				})

				$scope.get = function(){
	
			
			/* console.log($scope.country.countryname);
			console.log($scope.state.statename);
			console.log($scope.city.cityname);
			 */
			}



	});
</script>
</head>
<body>

<div class="container "  ng-app="count" ng-controller="ctrl">
	<div><h2>Angular JS Dropdown List</h2>
	    <div>
        Country: 
        <select class="form-group"  ng-model="country" ng-options="country.countryname for country in countries" >
          <option value=''>Select</option>
        </select>
    </div>
    <div>
        State: <select class="form-group"  ng-disabled="!country" ng-model="state" ng-options="state.statename for state in country.states"><option value=''>Select</option></select>
    </div>
    <div>
        Cities: <select class="form-group"  ng-disabled="!state" ng-model="city" ng-options="city.cityname for city in state.cities"><option value=''>Select</option></select>        
    </div>
	<button ng-click="get()">click</button>
  </div>
	</div>

</body>
</html>