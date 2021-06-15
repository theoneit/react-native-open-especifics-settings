
Pod::Spec.new do |s|
  s.name         = "RNOpenEspecificsSettings"
  s.version      = "1.0.0"
  s.summary      = "RNOpenEspecificsSettings"
  s.description  = <<-DESC
                  This module allows us to open device-specific settings. For example, if we want to open the GPS configuration to see if it is on / off or change it, or open the Location configuration window or Wifi, battery and others.
                   DESC
  s.homepage     = "https://github.com/FlavioTeodosio/react-native-open-especifics-settings"
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "Flavio Teodosio" => "flavioteodosiobr@gmail.com" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/theoneit/react-native-open-especifics-settings.git", :tag => "master" }
  s.source_files  = "RNOpenEspecificsSettings/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  