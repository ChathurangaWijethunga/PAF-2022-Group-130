<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Management</title>
</head>


<body>
<div class="container-fluid">

  <div class="row">

    <div class="col-xs-12 col-sm-12 col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 reducedCol well text-center">
      <form action="#box" role="form" name="elecForm" class="form">
        <fieldset class="form-group form-inline">

          <label for="curr">Current Reading</label> <input class="form-control inp" name="curr" type="number" value="" placeholder="Units in kWh">

          <label for="prev">Previous Reading</label> <input class="form-control inp" name="prev" type=" " value="" placeholder="Units in kWh">

        </fieldset>

        <fieldset class="form-group form-inline">
          <label for="startDate">Start Date</label>
          <input class="form-control inp" name="startDate" type="date">
          <label for="endDate">End Date</label>
          <input class="form-control inp" name="endDate" type="date">
        </fieldset>

        <fieldset class="form-group form-inline">
          <label for="sancLoad">Sanctioned Load</label>
          <select class="form-control inp" name="sancLoad">
            <option>2 kW</option>
            <option>>2-5 kW</option>
          </select>
        </fieldset>

        <fieldset class="form-group">
          <button class="btn bg-primary getButton" type="button" onClick="calcBill(this.form)">Get Bill</button>
        </fieldset>
      </form>
    </div>

    <div class="col-xs-12 col-sm-12 col-md-4 col-md-offset-4 col-lg-4 col-lg-offset-4">
      <div class="box text-responsive" id="#box">
        <center>
          <h2>Bill : </h2><span class="change" id="change"></span></center>
      </div>
    </div>

  </div>


</div>


</body>
</html>