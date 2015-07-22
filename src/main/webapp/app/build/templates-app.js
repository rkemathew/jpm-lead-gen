angular.module('templates-app', ['about/about.tpl.html', 'account/login.tpl.html', 'account/register.tpl.html', 'account/search.tpl.html', 'blog/manage-blogs.tpl.html', 'customer/manage-customer.tpl.html', 'home/home.tpl.html', 'proposalSession/advanced-debt-calc.tpl.html', 'proposalSession/assumed-sales-calc.tpl.html', 'proposalSession/commission-calc.tpl.html', 'proposalSession/customer-goal.tpl.html', 'proposalSession/jpm-model.tpl.html', 'proposalSession/manage-proposal-session.tpl.html', 'proposalSession/proposal-output.tpl.html', 'proposalSession/recruiting-effort-calc.tpl.html']);

angular.module("about/about.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("about/about.tpl.html",
    "<div class=\"row\">\n" +
    "  <h1 class=\"page-header\">\n" +
    "    The Elevator Pitch\n" +
    "    <small>For the lazy and impatient.</small>\n" +
    "  </h1>\n" +
    "  <p>\n" +
    "    <code>ng-boilerplate</code> is an opinionated kickstarter for web\n" +
    "    development projects. It's an attempt to create a simple starter for new\n" +
    "    web sites and apps: just download it and start coding. The goal is to\n" +
    "    have everything you need to get started out of the box; of course it has\n" +
    "    slick styles and icons, but it also has a best practice directory structure\n" +
    "    to ensure maximum code reuse. And it's all tied together with a robust\n" +
    "    build system chock-full of some time-saving goodness.\n" +
    "  </p>\n" +
    "\n" +
    "  <h2>Why?</h2>\n" +
    "\n" +
    "  <p>\n" +
    "    Because my team and I make web apps, and \n" +
    "    last year AngularJS became our client-side framework of choice. We start\n" +
    "    websites the same way every time: create a directory structure, copy and\n" +
    "    ever-so-slightly tweak some config files from an older project, and yada\n" +
    "    yada, etc., and so on and so forth. Why are we repeating ourselves? We wanted a starting point; a set of\n" +
    "    best practices that we could identify our projects as embodying and a set of\n" +
    "    time-saving wonderfulness, because time is money.\n" +
    "  </p>\n" +
    "\n" +
    "  <p>\n" +
    "    There are other similar projects out there, but none of them suited our\n" +
    "    needs. Some are awesome but were just too much, existing more as reference\n" +
    "    implementations, when we really just wanted a kickstarter. Others were just\n" +
    "    too little, with puny build systems and unscalable architectures.  So we\n" +
    "    designed <code>ng-boilerplate</code> to be just right.\n" +
    "  </p>\n" +
    "\n" +
    "  <h2>What ng-boilerplate Is Not</h2>\n" +
    "\n" +
    "  <p>\n" +
    "    This is not an example of an AngularJS app. This is a kickstarter. If\n" +
    "    you're looking for an example of what a complete, non-trivial AngularJS app\n" +
    "    that does something real looks like, complete with a REST backend and\n" +
    "    authentication and authorization, then take a look at <code><a\n" +
    "        href=\"https://github.com/angular-app/angular-app/\">angular-app</a></code>, \n" +
    "    which does just that, and does it well.\n" +
    "  </p>\n" +
    "\n" +
    "  <h1 class=\"page-header\">\n" +
    "    So What's Included?\n" +
    "    <small>I'll try to be more specific than \"awesomeness\".</small>\n" +
    "  </h1>\n" +
    "  <p>\n" +
    "    This section is just a quick introduction to all the junk that comes\n" +
    "    pre-packaged with <code>ng-boilerplate</code>. For information on how to\n" +
    "    use it, see the <a\n" +
    "      href=\"https://github.com/joshdmiller/ng-boilerplate#readme\">project page</a> at\n" +
    "    GitHub.\n" +
    "  </p>\n" +
    "\n" +
    "  <p>\n" +
    "    The high-altitude view is that the base project includes \n" +
    "    <a href=\"http://getbootstrap.com\">Twitter Bootstrap</a>\n" +
    "    styles to quickly produce slick-looking responsive web sites and apps. It also\n" +
    "    includes <a href=\"http://angular-ui.github.com/bootstrap\">UI Bootstrap</a>,\n" +
    "    a collection of native AngularJS directives based on the aforementioned\n" +
    "    templates and styles. It also includes <a href=\"http://fortawesome.github.com/Font-Awesome/\">Font Awesome</a>,\n" +
    "    a wicked-cool collection of font-based icons that work swimmingly with all\n" +
    "    manner of web projects; in fact, all images on the site are actually font-\n" +
    "    based icons from Font Awesome. Neat! Lastly, this also includes\n" +
    "    <a href=\"http://joshdmiller.github.com/angular-placeholders\">Angular Placeholders</a>,\n" +
    "    a set of pure AngularJS directives to do client-side placeholder images and\n" +
    "    text to make mocking user interfaces super easy.\n" +
    "  </p>\n" +
    "\n" +
    "  <p>\n" +
    "    And, of course, <code>ng-boilerplate</code> is built on <a href=\"http://angularjs.org\">AngularJS</a>,\n" +
    "    by the far the best JavaScript framework out there! But if you don't know\n" +
    "    that already, then how did you get here? Well, no matter - just drink the\n" +
    "    Kool Aid. Do it. You know you want to.\n" +
    "  </p>\n" +
    "  \n" +
    "  <h2>Twitter Bootstrap</h2>\n" +
    "\n" +
    "  <p>\n" +
    "    You already know about this, right? If not, <a\n" +
    "      href=\"http://getbootstrap.com\">hop on over</a> and check it out; it's\n" +
    "    pretty sweet. Anyway, all that wonderful stylistic goodness comes built in.\n" +
    "    The LESS files are available for you to import in your main stylesheet as\n" +
    "    needed - no excess, no waste. There is also a dedicated place to override\n" +
    "    variables and mixins to suit your specific needs, so updating to the latest\n" +
    "    version of Bootstrap is as simple as: \n" +
    "  </p>\n" +
    "\n" +
    "  <pre>$ cd vendor/twitter-bootstrap<br />$ git pull origin master</pre>\n" +
    "\n" +
    "  <p>\n" +
    "    Boom! And victory is ours.\n" +
    "  </p>\n" +
    "\n" +
    "  <h2>UI Bootstrap</h2>\n" +
    "\n" +
    "  <p>\n" +
    "    What's better than Bootstrap styles? Bootstrap directives!  The fantastic <a href=\"http://angular-ui.github.com/bootstrap\">UI Bootstrap</a>\n" +
    "    library contains a set of native AngularJS directives that are endlessly\n" +
    "    extensible. You get the tabs, the tooltips, the accordions. You get your\n" +
    "    carousel, your modals, your pagination. And <i>more</i>.\n" +
    "    How about a quick demo? \n" +
    "  </p>\n" +
    "\n" +
    "  <ul>\n" +
    "    <li class=\"dropdown\">\n" +
    "      <a class=\"btn dropdown-toggle\">\n" +
    "        Click me!\n" +
    "      </a>\n" +
    "      <ul class=\"dropdown-menu\">\n" +
    "        <li ng-repeat=\"choice in dropdownDemoItems\">\n" +
    "          <a>{{choice}}</a>\n" +
    "        </li>\n" +
    "      </ul>\n" +
    "    </li>\n" +
    "  </ul>\n" +
    "\n" +
    "  <p>\n" +
    "    Oh, and don't include jQuery;  \n" +
    "    you don't need it.\n" +
    "    This is better.\n" +
    "    Don't be one of those people. <sup>*</sup>\n" +
    "  </p>\n" +
    "\n" +
    "  <p><small><sup>*</sup> Yes, there are exceptions.</small></p>\n" +
    "\n" +
    "  <h2>Font Awesome</h2>\n" +
    "\n" +
    "  <p>\n" +
    "    Font Awesome has earned its label. It's a set of open (!) icons that come\n" +
    "    distributed as a font (!) for super-easy, lightweight use. Font Awesome \n" +
    "    works really well with Twitter Bootstrap, and so fits right in here.\n" +
    "  </p>\n" +
    "\n" +
    "  <p>\n" +
    "    There is not a single image on this site. All of the little images and icons \n" +
    "    are drawn through Font Awesome! All it takes is a little class:\n" +
    "  </p>\n" +
    "\n" +
    "  <pre>&lt;i class=\"fa fa-flag\"&gt;&lt/i&gt</pre>\n" +
    "\n" +
    "  <p>\n" +
    "    And you get one of these: <i class=\"fa fa-flag\"> </i>. Neat!\n" +
    "  </p>\n" +
    "\n" +
    "  <h2>Placeholders</h2>\n" +
    "\n" +
    "  <p>\n" +
    "    Angular Placeholders is a simple library for mocking up text and images. You\n" +
    "    can automatically throw around some \"lorem ipsum\" text:\n" +
    "  </p>\n" +
    "\n" +
    "  <pre>&lt;p ph-txt=\"3s\"&gt;&lt;/p&gt;</pre>\n" +
    "\n" +
    "  <p>\n" +
    "    Which gives you this:\n" +
    "  </p>\n" +
    "\n" +
    "  <div class=\"pre\">\n" +
    "    &lt;p&gt;\n" +
    "    <p ph-txt=\"3s\"></p>\n" +
    "    &lt;/p&gt;\n" +
    "  </div>\n" +
    "\n" +
    "  <p>\n" +
    "    Even more exciting, you can also create placeholder images, entirely \n" +
    "    client-side! For example, this:\n" +
    "  </p>\n" +
    "  \n" +
    "  <pre>\n" +
    "&lt;img ph-img=\"50x50\" /&gt;\n" +
    "&lt;img ph-img=\"50x50\" class=\"img-polaroid\" /&gt;\n" +
    "&lt;img ph-img=\"50x50\" class=\"img-rounded\" /&gt;\n" +
    "&lt;img ph-img=\"50x50\" class=\"img-circle\" /&gt;</pre>\n" +
    "\n" +
    "  <p>\n" +
    "    Gives you this:\n" +
    "  </p>\n" +
    "\n" +
    "  <div>\n" +
    "    <img ph-img=\"50x50\" />\n" +
    "    <img ph-img=\"50x50\" class=\"img-polaroid\" />\n" +
    "    <img ph-img=\"50x50\" class=\"img-rounded\" />\n" +
    "    <img ph-img=\"50x50\" class=\"img-circle\" />\n" +
    "  </div>\n" +
    "\n" +
    "  <p>\n" +
    "    Which is awesome.\n" +
    "  </p>\n" +
    "\n" +
    "  <h1 class=\"page-header\">\n" +
    "    The Roadmap\n" +
    "    <small>Really? What more could you want?</small>\n" +
    "  </h1>\n" +
    "\n" +
    "  <p>\n" +
    "    This is a project that is <i>not</i> broad in scope, so there's not really\n" +
    "    much of a wish list here. But I would like to see a couple of things:\n" +
    "  </p>\n" +
    "\n" +
    "  <p>\n" +
    "    I'd like it to be a little simpler. I want this to be a universal starting\n" +
    "    point. If someone is starting a new AngularJS project, she should be able to\n" +
    "    clone, merge, or download its source and immediately start doing what she\n" +
    "    needs without renaming a bunch of files and methods or deleting spare parts\n" +
    "    ... like this page. This works for a first release, but I just think there\n" +
    "    is a little too much here right now.\n" +
    "  </p>\n" +
    "\n" +
    "  <p>\n" +
    "    I'd also like to see a simple generator. Nothing like <a href=\"yeoman.io\">\n" +
    "    Yeoman</a>, as there already is one of those, but just something that\n" +
    "    says \"I want Bootstrap but not Font Awesome and my app is called 'coolApp'.\n" +
    "    Gimme.\" Perhaps a custom download builder like UI Bootstrap\n" +
    "    has. Like that. Then again, perhaps some Yeoman generators wouldn't be out\n" +
    "    of line. I don't know. What do you think?\n" +
    "  </p>\n" +
    "\n" +
    "  <p>\n" +
    "    Naturally, I am open to all manner of ideas and suggestions. See the \"Can I\n" +
    "    Help?\" section below.\n" +
    "  </p>\n" +
    "\n" +
    "  <h2>The Tactical To Do List</h2>\n" +
    "\n" +
    "  <p>\n" +
    "    There isn't much of a demonstration of UI Bootstrap. I don't want to pollute\n" +
    "    the code with a demo for demo's sake, but I feel we should showcase it in\n" +
    "    <i>some</i> way.\n" +
    "  </p>\n" +
    "\n" +
    "  <p>\n" +
    "    <code>ng-boilerplate</code> should include end-to-end tests. This should\n" +
    "    happen soon. I just haven't had the time.\n" +
    "  </p>\n" +
    "\n" +
    "  <p>\n" +
    "    Lastly, this site should be prettier, but I'm no web designer. Throw me a\n" +
    "    bone here, people!\n" +
    "  </p>\n" +
    "\n" +
    "  <h2>Can I Help?</h2>\n" +
    "\n" +
    "  <p>\n" +
    "    Yes, please!\n" +
    "  </p>\n" +
    "\n" +
    "  <p>\n" +
    "    This is an opinionated kickstarter, but the opinions are fluid and\n" +
    "    evidence-based. Don't like the way I did something? Think you know of a\n" +
    "    better way? Have an idea to make this more useful? Let me know! You can\n" +
    "    contact me through all the usual channels or you can open an issue on the\n" +
    "    GitHub page. If you're feeling ambitious, you can even submit a pull\n" +
    "    request - how thoughtful of you!\n" +
    "  </p>\n" +
    "\n" +
    "  <p>\n" +
    "    So join the team! We're good people.\n" +
    "  </p>\n" +
    "</div>\n" +
    "\n" +
    "");
}]);

angular.module("account/login.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("account/login.tpl.html",
    "<div class=\"row\">\n" +
    "  <h1 class=\"page-header\">\n" +
    "      Login\n" +
    "  </h1>\n" +
    "  <form ng-submit=\"login()\">\n" +
    "      <div class=\"form-group\">\n" +
    "          <label>Username:</label>\n" +
    "          <input type=\"text\" ng-model=\"account.name\" class=\"form-control\"/>\n" +
    "      </div>\n" +
    "      <div class=\"form-group\">\n" +
    "          <label>Password:</label>\n" +
    "          <input type=\"password\" ng-model=\"account.password\" class=\"form-control\"/>\n" +
    "      </div>\n" +
    "      <button class=\"btn btn-success\" type=\"submit\">Login</button>\n" +
    "  </form>\n" +
    "</div>\n" +
    "\n" +
    "");
}]);

angular.module("account/register.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("account/register.tpl.html",
    "<div class=\"row\">\n" +
    "  <h1 class=\"page-header\">\n" +
    "      Register\n" +
    "  </h1>\n" +
    "  <form ng-submit=\"register()\">\n" +
    "      <div class=\"form-group\">\n" +
    "          <label>Username:</label>\n" +
    "          <input type=\"text\" ng-model=\"account.name\" class=\"form-control\" />\n" +
    "      </div>\n" +
    "      <div class=\"form-group\">\n" +
    "          <label>Password:</label>\n" +
    "          <input type=\"password\" ng-model=\"account.password\" class=\"form-control\" />\n" +
    "      </div>\n" +
    "      <button class=\"btn btn-success\" type=\"submit\">Register</button>\n" +
    "  </form>\n" +
    "</div>\n" +
    "\n" +
    "");
}]);

angular.module("account/search.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("account/search.tpl.html",
    "<div class=\"row\">\n" +
    "    <div class=\"form-group\">\n" +
    "        <input type=\"text\" class=\"form-control\" ng-model=\"q\" placeholder=\"account name\"/>\n" +
    "    </div>\n" +
    "\n" +
    "    <table class=\"table table-striped\">\n" +
    "        <th>Account Name</th>\n" +
    "        <th>Actions</th>\n" +
    "        <tr ng-repeat=\"account in accounts | filter:q\">\n" +
    "            <td>{{account.name}}</td>\n" +
    "            <td>\n" +
    "                <a ui-sref=\"manageBlogs({accountId:account.rid})\" class=\"btn btn-large btn-default\">\n" +
    "                    Manage\n" +
    "                </a>\n" +
    "            </td>\n" +
    "        </tr>\n" +
    "    </table>\n" +
    "</div>");
}]);

angular.module("blog/manage-blogs.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("blog/manage-blogs.tpl.html",
    "<div class=\"row no-gutters\">\n" +
    "    <h1>Blog Management For {{name}}</h1>\n" +
    "</div>\n" +
    "<div class=\"row no-gutters\">\n" +
    "    <div class=\"input-group component-group\">\n" +
    "        <input type=\"text\" class=\"form-control\" ng-model=\"newBlogName\">\n" +
    "      <span class=\"input-group-btn\">\n" +
    "        <button class=\"btn btn-default\" type=\"button\" ng-click=\"createBlog(newBlogName)\">Create New Blog!</button>\n" +
    "      </span>\n" +
    "    </div><!-- /input-group -->\n" +
    "</div>\n" +
    "<div class=\"row no-gutters\">\n" +
    "    <table class=\"table table-striped\">\n" +
    "        <th>Blog Name</th>\n" +
    "        <th>Action</th>\n" +
    "        <tr ng-repeat=\"blog in blogs\">\n" +
    "            <td>{{blog.title}}</td>\n" +
    "            <td>\n" +
    "                <a ui-sref=\"manageBlogs({accountId:account.rid})\" class=\"btn btn-large btn-default\">\n" +
    "                    Delete\n" +
    "                </a>\n" +
    "            </td>\n" +
    "        </tr>\n" +
    "    </table>\n" +
    "</div>\n" +
    "</div>");
}]);

angular.module("customer/manage-customer.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("customer/manage-customer.tpl.html",
    "<style>\n" +
    "    /* reset everything to the default box model */\n" +
    "    *, :before, :after {\n" +
    "    -webkit-box-sizing: content-box;\n" +
    "    -moz-box-sizing: content-box;\n" +
    "    box-sizing: content-box;\n" +
    "    }\n" +
    "\n" +
    "    /* set a border-box model only to elements that need it */\n" +
    "    .form-control, /* if this class is applied to a Kendo UI widget, its layout may change */\n" +
    "    .container,\n" +
    "    .container-fluid,\n" +
    "    .row,\n" +
    "    .col-xs-1, .col-sm-1, .col-md-1, .col-lg-1,\n" +
    "    .col-xs-2, .col-sm-2, .col-md-2, .col-lg-2,\n" +
    "    .col-xs-3, .col-sm-3, .col-md-3, .col-lg-3,\n" +
    "    .col-xs-4, .col-sm-4, .col-md-4, .col-lg-4,\n" +
    "    .col-xs-5, .col-sm-5, .col-md-5, .col-lg-5,\n" +
    "    .col-xs-6, .col-sm-6, .col-md-6, .col-lg-6,\n" +
    "    .col-xs-7, .col-sm-7, .col-md-7, .col-lg-7,\n" +
    "    .col-xs-8, .col-sm-8, .col-md-8, .col-lg-8,\n" +
    "    .col-xs-9, .col-sm-9, .col-md-9, .col-lg-9,\n" +
    "    .col-xs-10, .col-sm-10, .col-md-10, .col-lg-10,\n" +
    "    .col-xs-11, .col-sm-11, .col-md-11, .col-lg-11,\n" +
    "    .col-xs-12, .col-sm-12, .col-md-12, .col-lg-12 {\n" +
    "    -webkit-box-sizing: border-box;\n" +
    "    -moz-box-sizing: border-box;\n" +
    "    box-sizing: border-box;\n" +
    "    }\n" +
    "</style>\n" +
    "<div class=\"row\">\n" +
    "    <h1 class=\"page-header\">\n" +
    "        Customer Management\n" +
    "    </h1>\n" +
    "    <form name=\"customerForm\" ng-submit=\"createCustomer()\" class=\"form-horizontal\">\n" +
    "        <div class=\"form-group form-group-lg\">\n" +
    "            <label class=\"col-sm-2 control-label\" for=\"contactName\">Contact Name:</label>\n" +
    "            <div class=\"col-sm-4\">\n" +
    "                <input id=\"contactName\" type=\"text\" ng-model=\"customer.contactName\" placeholder=\"Enter Company Contact Name\" class=\"form-control\" />\n" +
    "            </div>\n" +
    "        </div>\n" +
    "        <div class=\"form-group form-group-lg\">\n" +
    "            <label class=\"col-sm-2 control-label\" for=\"companyName\">Company Name:</label>\n" +
    "            <div class=\"col-sm-4\">\n" +
    "                <input id=\"companyName\" type=\"text\" ng-model=\"customer.companyName\" placeholder=\"Enter Company Name\" class=\"form-control\" />\n" +
    "            </div>\n" +
    "        </div>\n" +
    "        <div class=\"form-group form-group-lg\">\n" +
    "            <label class=\"col-sm-2 control-label\" for=\"addressStreet1\">Address 1:</label>\n" +
    "            <div class=\"col-sm-4\">\n" +
    "                <input id=\"addressStreet1\" type=\"text\" ng-model=\"customer.addressStreet1\" placeholder=\"Enter Street Address\" class=\"form-control\"/>\n" +
    "            </div>\n" +
    "        </div>\n" +
    "        <div class=\"form-group form-group-lg\">\n" +
    "            <label class=\"col-sm-2 control-label\" for=\"addressStreet2\">Address 2:</label>\n" +
    "            <div class=\"col-sm-4\">\n" +
    "                <input id=\"addressStreet2\" type=\"text\" ng-model=\"customer.addressStreet2\" placeholder=\"Optional Additional Street Address\" class=\"form-control\" />\n" +
    "            </div>\n" +
    "        </div>\n" +
    "        <div class=\"form-group form-group-lg\">\n" +
    "            <label class=\"col-sm-2 control-label\" for=\"city\">City:</label>\n" +
    "            <div class=\"col-sm-4\">\n" +
    "                <input id=\"city\" type=\"text\" ng-model=\"customer.city\" class=\"form-control\" placeholder=\"Enter City\"/>\n" +
    "            </div>\n" +
    "        </div>\n" +
    "        <div class=\"form-group form-group-lg\">\n" +
    "            <label class=\"col-sm-2 control-label\" for=\"state\">State:</label>\n" +
    "            <div class=\"col-sm-4\">\n" +
    "                <select kendo-combo-box id=\"state\" ng-model=\"customer.state\" data-placeholder=\"'Choose State'\" class=\"form-control\">\n" +
    "                    <option value=\"\"></option>\n" +
    "                    <option ng-repeat=\"state in states\" value=\"{{state.value}}\">{{state.display}}</option>\n" +
    "                </select>\n" +
    "            </div>\n" +
    "        </div>\n" +
    "        <div class=\"form-group form-group-lg\">\n" +
    "            <label class=\"col-sm-2 control-label\" for=\"zip\">Zip:</label>\n" +
    "            <div class=\"col-sm-4\">\n" +
    "                <input id=\"zip\" kendo-masked-text-box raw-mask=\"customer.zip\" k-mask=\"'99999-0000'\" k-prompt-char=\"' '\" class=\"form-control\"/>\n" +
    "            </div>\n" +
    "        </div>\n" +
    "        <div class=\"form-group form-group-lg\">\n" +
    "            <label class=\"col-sm-2 control-label\" for=\"phone1\">Phone 1:</label>\n" +
    "            <div class=\"col-sm-4\">\n" +
    "                <input id=\"phone1\" kendo-masked-text-box raw-mask=\"customer.phone1\" k-mask=\"'(999) 000-0000'\" k-prompt-char=\"' '\" class=\"form-control\" />\n" +
    "            </div>\n" +
    "        </div>\n" +
    "        <div class=\"form-group form-group-lg\">\n" +
    "            <label class=\"col-sm-2 control-label\" for=\"phone2\">Phone 2:</label>\n" +
    "            <div class=\"col-sm-4\">\n" +
    "                <input id=\"phone2\" kendo-masked-text-box raw-mask=\"customer.phone2\" k-mask=\"'(999) 000-0000'\" k-prompt-char=\"' '\" class=\"form-control\"/>\n" +
    "            </div>\n" +
    "        </div>\n" +
    "        <div class=\"form-group form-group-lg\" ng-class=\"{ 'has-error': customerForm.email.$invalid }\">\n" +
    "            <label class=\"col-sm-2 control-label\" for=\"email\">Email:</label>\n" +
    "            <div class=\"col-sm-4\">\n" +
    "                <input id=\"email\" name=\"email\" type=\"email\" ng-model=\"customer.email\" class=\"form-control\"/>\n" +
    "            </div>\n" +
    "            <div role=\"alert\">\n" +
    "                <span class=\"error\" ng-show=\"customerForm.email.$error.email\">\n" +
    "                    Not a valid email!\n" +
    "                </span>\n" +
    "            </div>\n" +
    "        </div>\n" +
    "\n" +
    "        <div class=\"form-group form-group-lg\">\n" +
    "            <div class=\"col-sm-6\">\n" +
    "                <button class=\"btn btn-success pull-right\" type=\"submit\">Create Customer</button>\n" +
    "            </div>\n" +
    "        </div>\n" +
    "\n" +
    "        <div id=\"customerEditConfirmDialog\"></div>\n" +
    "        <script type=\"text/ng-template\" id=\"customerEditConfirmationDialogContent\">\n" +
    "            <p>#= errorMessage #, would you like to edit it?</p>\n" +
    "            <div class=\"text-center\">\n" +
    "                <button class=\"btn btn-warning\">Yes</button>\n" +
    "                <button class=\"btn btn-warning\">No</button>\n" +
    "            </div>\n" +
    "        </script>\n" +
    "    </form>\n" +
    "</div>\n" +
    "\n" +
    "");
}]);

angular.module("home/home.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("home/home.tpl.html",
    "<div class=\"jumbotron\">\n" +
    "  <h1>Non-Trivial AngularJS Made Easy</h1>\n" +
    "\n" +
    "  <p class=\"lead\">\n" +
    "    Everything you need to kickstart AngularJS projects: a best-practice\n" +
    "    directory structure, an intelligent build system, and the best web design\n" +
    "    libraries around.\n" +
    "  </p>\n" +
    "\n" +
    "  <ul class=\"list-inline social-buttons\">\n" +
    "    <li>\n" +
    "      <iframe \n" +
    "        src=\"http://ghbtns.com/github-btn.html?user=ngbp&amp;repo=ngbp&amp;type=watch&amp;count=true\" \n" +
    "        allowtransparency=\"true\" \n" +
    "        frameborder=\"0\" \n" +
    "        scrolling=\"0\" \n" +
    "        width=\"110\" \n" +
    "        height=\"20\">\n" +
    "      </iframe>\n" +
    "    </li>\n" +
    "    <li>\n" +
    "      <iframe \n" +
    "        src=\"http://ghbtns.com/github-btn.html?user=ngbp&amp;repo=ngbp&amp;type=fork&amp;count=true\" \n" +
    "        allowtransparency=\"true\" \n" +
    "        frameborder=\"0\" \n" +
    "        scrolling=\"0\" \n" +
    "        width=\"95\" \n" +
    "        height=\"20\">\n" +
    "      </iframe>\n" +
    "    </li>\n" +
    "    <li>\n" +
    "       <iframe allowtransparency=\"true\" frameborder=\"0\" scrolling=\"no\"\n" +
    "        src=\"https://platform.twitter.com/widgets/tweet_button.html?url=http%3A%2F%2Fbit.ly%2FngBoilerplate&counturl=http%3A%2F%2Fngbp.github.com%2Fngbp&text=Check%20out%20%23ngbp%20-%20an%20awesome%20kickstarter%20for%20web%20projects%20%7C&hashtags=angularjs&via=joshdmiller&related=joshdmiller\"\n" +
    "        style=\"width:130px; height:20px;\"></iframe>\n" +
    "    </li>\n" +
    "    <li plus-one></li>\n" +
    "  </ul> \n" +
    "  \n" +
    "  <div class=\"btn-group\" ng-hide=\"isLoggedIn()\">\n" +
    "    <a ui-sref=\"login\" class=\"btn btn-large btn-default\">\n" +
    "      <i class=\"fa fa-book\"></i>\n" +
    "      Login\n" +
    "    </a>\n" +
    "    <a ui-sref=\"register\" class=\"btn btn-large btn-success\">\n" +
    "      <i class=\"fa fa-download\"></i>\n" +
    "      Register\n" +
    "    </a>\n" +
    "  </div>\n" +
    "\n" +
    "    <div class=\"btn-group\" ng-show=\"isLoggedIn()\">\n" +
    "        <a ng-click=\"logout()\" class=\"btn btn-large btn-default\">\n" +
    "            <i class=\"fa fa-book\"></i>\n" +
    "            Logout\n" +
    "        </a>\n" +
    "    </div>\n" +
    "\n" +
    "\n" +
    "</div>\n" +
    "\n" +
    "<div class=\"marketing\">\n" +
    "  <div class=\"row\">\n" +
    "    <div class=\"col-xs-12 col-sm-6 col-md-4\">\n" +
    "      <h4><i class=\"fa fa-thumbs-up\"></i> Good to Go!</h4>\n" +
    "      <p>\n" +
    "        Kickstarts your project quickly, with everything you need, so you can \n" +
    "        focus on what matters: your app.\n" +
    "      </p>\n" +
    "    </div>\n" +
    "    <div class=\"col-xs-12 col-sm-6 col-md-4\">\n" +
    "      <h4><i class=\"fa fa-magic\"></i> Complete Build System</h4>\n" +
    "      <p>\n" +
    "        A smart, <a href=\"http://gruntjs.com\">Grunt</a>-based build system \n" +
    "        designed to save you time and energy.\n" +
    "      </p>\n" +
    "    </div>\n" +
    "    <div class=\"col-xs-12 col-sm-6 col-md-4\">\n" +
    "      <h4><i class=\"fa fa-retweet\"></i> Modularization</h4>\n" +
    "      <p>\n" +
    "        Supports a structure that maintains separation of concerns while\n" +
    "        ensuring maximum code reuse.\n" +
    "      </p>\n" +
    "    </div>\n" +
    "  </div>\n" +
    "  <div class=\"row\">\n" +
    "    <div class=\"col-xs-12 col-sm-6 col-md-4\">\n" +
    "      <h4><i class=\"fa fa-star\"></i> AngularJS</h4>\n" +
    "      <p>\n" +
    "        JavaScript framework that augments browser-based, single-page \n" +
    "        applications with MVC functionality.\n" +
    "        <a href=\"http://angularjs.org\">More &raquo;</a>\n" +
    "      </p>\n" +
    "    </div>\n" +
    "    <div class=\"col-xs-12 col-sm-6 col-md-4\">\n" +
    "      <h4><i class=\"fa fa-resize-small\"></i> LESS CSS</h4>\n" +
    "      <p>\n" +
    "        The dynamic stylesheet language that extends CSS with efficiency.\n" +
    "        <a href=\"http://lesscss.org\">More &raquo;</a>\n" +
    "      </p>\n" +
    "    </div>\n" +
    "    <div class=\"col-xs-12 col-sm-6 col-md-4\">\n" +
    "      <h4><i class=\"fa fa-twitter\"></i> Twitter Bootstrap</h4>\n" +
    "      <p>\n" +
    "        Sleek, intuitive, and powerful front-end framework for faster and easier\n" +
    "        web development.\n" +
    "        <a href=\"http://getbootstrap.com\">More &raquo;</a>\n" +
    "      </p>\n" +
    "    </div>\n" +
    "  </div>\n" +
    "  <div class=\"row\">\n" +
    "    <div class=\"col-xs-12 col-sm-6 col-md-4\">\n" +
    "      <h4><i class=\"fa fa-circle\"></i> Angular UI Bootstrap</h4>\n" +
    "      <p>\n" +
    "        Pure AngularJS components for Bootstrap written by the \n" +
    "        <a href=\"https://github.com/angular-ui?tab=members\">AngularUI Team</a>.\n" +
    "        <a href=\"http://angular-ui.github.com/bootstrap\">More &raquo;</a>\n" +
    "      </p>\n" +
    "    </div>\n" +
    "    <div class=\"col-xs-12 col-sm-6 col-md-4\">\n" +
    "      <h4><i class=\"fa fa-flag\"></i> Font Awesome</h4>\n" +
    "      <p>\n" +
    "        The iconic font designed for use with Twitter Bootstrap.\n" +
    "        <a href=\"http://fortawesome.github.com/Font-Awesome\">\n" +
    "          More &raquo;\n" +
    "        </a>\n" +
    "      </p>\n" +
    "    </div>\n" +
    "    <div class=\"col-xs-12 col-sm-6 col-md-4\">\n" +
    "      <h4><i class=\"fa fa-asterisk\"></i> Placeholders</h4>\n" +
    "      <p>\n" +
    "        Client-side image and text placeholder directives written in pure \n" +
    "        AngularJS to make designing mock-ups wicked-fast.\n" +
    "        <a href=\"http://joshdmiller.github.com/angular-placeholders\">\n" +
    "          More &raquo;\n" +
    "        </a>\n" +
    "      </p>\n" +
    "    </div>\n" +
    "  </div>\n" +
    "</div>\n" +
    "\n" +
    "");
}]);

angular.module("proposalSession/advanced-debt-calc.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("proposalSession/advanced-debt-calc.tpl.html",
    "<h3 class=\"page-header\">Advanced to Debt Ratio Calculator</h3>\n" +
    "");
}]);

angular.module("proposalSession/assumed-sales-calc.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("proposalSession/assumed-sales-calc.tpl.html",
    "<h3 class=\"page-header\">Assumed Sales Caculator</h3>\n" +
    "");
}]);

angular.module("proposalSession/commission-calc.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("proposalSession/commission-calc.tpl.html",
    "<h3 class=\"page-header\">Commission Calculator</h3>\n" +
    "");
}]);

angular.module("proposalSession/customer-goal.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("proposalSession/customer-goal.tpl.html",
    "<h3 class=\"page-header\">Customer Goals</h3>\n" +
    "\n" +
    "<form name=\"customerGoalForm\" class=\"form-horizontal\">\n" +
    "    <div class=\"form-group form-group-lg\">\n" +
    "        <label class=\"col-sm-2 control-label\" for=\"contactName\">Contact Name:</label>\n" +
    "        <div class=\"col-sm-4\">\n" +
    "            <input id=\"contactName\" type=\"text\" ng-model=\"proposalSession.customerGoal.customer.contactName\" ng-disabled=\"true\" class=\"form-control\" />\n" +
    "        </div>\n" +
    "    </div>\n" +
    "    <div class=\"form-group form-group-lg\">\n" +
    "        <label class=\"col-sm-2 control-label\" for=\"companyName\">Company Name:</label>\n" +
    "        <div class=\"col-sm-4\">\n" +
    "            <input kendo-auto-complete id=\"companyName\"\n" +
    "                   ng-model=\"companyNameLookup\"\n" +
    "                   k-options=\"customerAutoComplete\" class=\"form-control\" style=\"height: 100%;\"/>\n" +
    "        </div>\n" +
    "    </div>\n" +
    "    <div class=\"form-group form-group-lg\">\n" +
    "        <label class=\"col-sm-2 control-label\" for=\"currentValuation\">Current Valuation:</label>\n" +
    "        <div class=\"col-sm-4\">\n" +
    "            <input kendo-numeric-text-box id=\"currentValuation\" k-options=\"kendoNumericTextBoxOptions\" k-ng-model=\"proposalSession.customerGoal.currentValuation\" style=\"width: 100%; height: 100%;\" />\n" +
    "        </div>\n" +
    "    </div>\n" +
    "    <div class=\"form-group form-group-lg\">\n" +
    "        <label class=\"col-sm-5 control-label\"><h4>Annual Revenue Goals</h4></label>\n" +
    "    </div>\n" +
    "    <div class=\"form-group form-group-lg\">\n" +
    "        <label class=\"col-sm-2 control-label\" for=\"revenueGoalYear1\">Year 1:</label>\n" +
    "        <div class=\"col-sm-4\">\n" +
    "            <input kendo-numeric-text-box id=\"revenueGoalYear1\" k-options=\"kendoNumericTextBoxOptions\" k-ng-model=\"proposalSession.customerGoal.revenueGoalYear1\" style=\"width: 100%; height: 100%;\" />\n" +
    "        </div>\n" +
    "    </div>\n" +
    "    <div class=\"form-group form-group-lg\">\n" +
    "        <label class=\"col-sm-2 control-label\" for=\"revenueGoalYear2\">Year 2:</label>\n" +
    "        <div class=\"col-sm-4\">\n" +
    "            <input kendo-numeric-text-box id=\"revenueGoalYear2\" k-options=\"kendoNumericTextBoxOptions\" k-ng-model=\"proposalSession.customerGoal.revenueGoalYear2\" style=\"width: 100%; height: 100%;\" />\n" +
    "        </div>\n" +
    "    </div>\n" +
    "    <div class=\"form-group form-group-lg\">\n" +
    "        <label class=\"col-sm-2 control-label\" for=\"revenueGoalYear3\">Year 3:</label>\n" +
    "        <div class=\"col-sm-4\">\n" +
    "            <input kendo-numeric-text-box id=\"revenueGoalYear3\" k-options=\"kendoNumericTextBoxOptions\" k-ng-model=\"proposalSession.customerGoal.revenueGoalYear3\" style=\"width: 100%; height: 100%;\" />\n" +
    "        </div>\n" +
    "    </div>\n" +
    "    <div class=\"form-group form-group-lg\">\n" +
    "        <label class=\"col-sm-2 control-label\" for=\"revenueGoalYear4\">Year 4:</label>\n" +
    "        <div class=\"col-sm-4\">\n" +
    "            <input kendo-numeric-text-box id=\"revenueGoalYear4\" k-options=\"kendoNumericTextBoxOptions\" k-ng-model=\"proposalSession.customerGoal.revenueGoalYear4\" style=\"width: 100%; height: 100%;\" />\n" +
    "        </div>\n" +
    "    </div>\n" +
    "    <div class=\"form-group form-group-lg\">\n" +
    "        <label class=\"col-sm-2 control-label\" for=\"revenueGoalYear5\">Year 5:</label>\n" +
    "        <div class=\"col-sm-4\">\n" +
    "            <input kendo-numeric-text-box id=\"revenueGoalYear5\" k-options=\"kendoNumericTextBoxOptions\" k-ng-model=\"proposalSession.customerGoal.revenueGoalYear5\" style=\"width: 100%; height: 100%;\" />\n" +
    "        </div>\n" +
    "    </div>\n" +
    "    <div class=\"form-group form-group-lg\">\n" +
    "        <label class=\"col-sm-2 control-label\" for=\"upfrontFees\">Upfront Fees:</label>\n" +
    "        <div class=\"col-sm-4\">\n" +
    "            <input kendo-numeric-text-box id=\"upfrontFees\" k-options=\"kendoNumericTextBoxOptions\" k-ng-model=\"proposalSession.customerGoal.upfrontFees\" style=\"width: 100%; height: 100%;\" />\n" +
    "        </div>\n" +
    "    </div>\n" +
    "    <div class=\"form-group form-group-lg\">\n" +
    "        <label class=\"col-sm-2 control-label\" for=\"lagTime\">Lag Time:</label>\n" +
    "        <div class=\"col-sm-4\">\n" +
    "            <input kendo-numeric-text-box id=\"lagTime\" k-options=\"lagTimeTextBoxOptions\" k-ng-model=\"proposalSession.customerGoal.lagTime\" style=\"width: 100%; height: 100%;\" />\n" +
    "        </div>\n" +
    "    </div>\n" +
    "</form>\n" +
    "");
}]);

angular.module("proposalSession/jpm-model.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("proposalSession/jpm-model.tpl.html",
    "<h3 class=\"page-header\">JPM Model</h3>\n" +
    "");
}]);

angular.module("proposalSession/manage-proposal-session.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("proposalSession/manage-proposal-session.tpl.html",
    "<style>\n" +
    "    /* reset everything to the default box model */\n" +
    "    *, :before, :after {\n" +
    "        -webkit-box-sizing: content-box;\n" +
    "        -moz-box-sizing: content-box;\n" +
    "        box-sizing: content-box;\n" +
    "    }\n" +
    "\n" +
    "    /* set a border-box model only to elements that need it */\n" +
    "    .form-control, /* if this class is applied to a Kendo UI widget, its layout may change */\n" +
    "    .container,\n" +
    "    .container-fluid,\n" +
    "    .row,\n" +
    "    .col-xs-1, .col-sm-1, .col-md-1, .col-lg-1,\n" +
    "    .col-xs-2, .col-sm-2, .col-md-2, .col-lg-2,\n" +
    "    .col-xs-3, .col-sm-3, .col-md-3, .col-lg-3,\n" +
    "    .col-xs-4, .col-sm-4, .col-md-4, .col-lg-4,\n" +
    "    .col-xs-5, .col-sm-5, .col-md-5, .col-lg-5,\n" +
    "    .col-xs-6, .col-sm-6, .col-md-6, .col-lg-6,\n" +
    "    .col-xs-7, .col-sm-7, .col-md-7, .col-lg-7,\n" +
    "    .col-xs-8, .col-sm-8, .col-md-8, .col-lg-8,\n" +
    "    .col-xs-9, .col-sm-9, .col-md-9, .col-lg-9,\n" +
    "    .col-xs-10, .col-sm-10, .col-md-10, .col-lg-10,\n" +
    "    .col-xs-11, .col-sm-11, .col-md-11, .col-lg-11,\n" +
    "    .col-xs-12, .col-sm-12, .col-md-12, .col-lg-12 {\n" +
    "        -webkit-box-sizing: border-box;\n" +
    "        -moz-box-sizing: border-box;\n" +
    "        box-sizing: border-box;\n" +
    "    }\n" +
    "</style>\n" +
    "<div class=\"row\">\n" +
    "    <h1 class=\"page-header\">\n" +
    "        Proposal Session\n" +
    "    </h1>\n" +
    "\n" +
    "    <!-- Nav tabs -->\n" +
    "    <div kendo-tab-strip k-options=\"proposalFormKendoTabStrip\">\n" +
    "        <ul>\n" +
    "            <li class=\"k-state-active\"><i class=\"fa fa-soccer-ball-o\"></i> Customer Goal</li>\n" +
    "            <li><i class=\"fa fa-pencil-square\"></i> JPM Model</li>\n" +
    "            <li><i class=\"fa fa-calculator\"></i> Assumed Sales Calc</li>\n" +
    "            <li><i class=\"fa fa-calculator\"></i> Commission Calc</li>\n" +
    "            <li><i class=\"fa fa-calculator\"></i> Recruiting Effort Calc</li>\n" +
    "            <li><i class=\"fa fa-calculator\"></i> Advanced:Debt Calc</li>\n" +
    "            <li><i class=\"fa fa-newspaper-o\"></i> Proposal</li>\n" +
    "        </ul>\n" +
    "\n" +
    "        <!-- Tab panes -->\n" +
    "        <div customer-goal></div>\n" +
    "        <div jpm-model></div>\n" +
    "        <div assumed-sales-calc></div>\n" +
    "        <div commission-calc></div>\n" +
    "        <div recruiting-effort-calc></div>\n" +
    "        <div advanced-debt-calc></div>\n" +
    "        <div proposal-output></div>\n" +
    "    </div>\n" +
    "</div>\n" +
    "\n" +
    "");
}]);

angular.module("proposalSession/proposal-output.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("proposalSession/proposal-output.tpl.html",
    "<h3 class=\"page-header\">Proposal Output</h3>\n" +
    "");
}]);

angular.module("proposalSession/recruiting-effort-calc.tpl.html", []).run(["$templateCache", function($templateCache) {
  $templateCache.put("proposalSession/recruiting-effort-calc.tpl.html",
    "<h3 class=\"page-header\">Recruiting Effort Calculator</h3>\n" +
    "");
}]);
