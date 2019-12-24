var host ="http://localhost:8080/";
var config={
  host,
  order_url:host+"orders",
  order1_url: host + "orders1",
  order2_url: host + "orders2",
  list_url:host+"list",
  store_url:host+"store"
}
module.exports=config;